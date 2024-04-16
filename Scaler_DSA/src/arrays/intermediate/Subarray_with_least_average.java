package arrays.intermediate;

public class Subarray_with_least_average {

    /*Average for any particular subarray is sum_of_elements/no_of_elements.
In this no. of elements is same in each subarray as we have to find only subarray of size k.
So now question reduces to find subarray which has minimum sum.
*/
    public int solve(int[] A, int B) {

        long sum = 0;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int ans = 0; // start index of the first window
        int s = 1, e = B;
        long minSum = sum;
        while (e < A.length) {
            sum -= A[s - 1];
            sum += A[e];

            if (sum < minSum) {
                minSum = sum;
                ans = s;
            }
            s++;
            e++;
        }
        return ans;
    }

    public static void main(String[] args) {

        var obj = new Subarray_with_least_average();
        /*System.out.println(obj.solve(new int[]{3, 7, 90, 20, 10, 50, 40},3));
        System.out.println(obj.solve(new int[]{3, 7, 5, 20, -10, 0, 12},2));*/

        System.out.println(obj.solve(new int[]{20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11}, 9));
    }
}
