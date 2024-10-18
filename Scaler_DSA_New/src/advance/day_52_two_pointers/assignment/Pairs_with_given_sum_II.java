package advance.day_52_two_pointers.assignment;

public class Pairs_with_given_sum_II {

    public static int solve(int[] A, int B) {
        long count = 0;
        int i = 0, j = A.length - 1;
        int mod = 1000000007;

        while (i < j) {

            if (A[i] + A[j] == B) {

                //If different numbers
                if (A[i] != A[j]) {
                    long count_i = 1, count_j = 1;
                    while (i + 1 < j && A[i] == A[i + 1]) {
                        i++;
                        count_i++;
                    }
                    while (j - 1 > i && A[j] == A[j - 1]) {
                        j--;
                        count_j++;
                    }
                    count += count_i * count_j;
                } else {
                    /*
                        i starts from 0 and j starts from n-1.
                        The moment a[i] == a[j] so any element from i + 1, i+2,...j-2,j-1 all are same.Hence breaking out from loop.
                    */
                    long count_i = j - i + 1;
                    count += (count_i * (count_i - 1)) / 2;
                    break;
                }
                i++;
                j--;
            } else if (A[i] + A[j] < B) {
                i++;
            } else {
                j--;
            }
        }

        return (int)(count % mod);
    }

    public static void main(String[] args) {

     /*   int[] arr = {1,1,1};
        int B = 2;
        System.out.println(solve(arr,B));

        System.out.println(solve(new int[]{1,5,7,10},8));*/

        System.out.println(solve(new int[]{1,1,4,6,9,9},10));
    }
}
