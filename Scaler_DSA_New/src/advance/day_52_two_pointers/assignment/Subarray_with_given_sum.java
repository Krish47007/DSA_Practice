package advance.day_52_two_pointers.assignment;

public class Subarray_with_given_sum {

    public static int[] solve(int[] A, int B) {

        int n = A.length;
        int sum = A[0], i = 0, j = 0;

        while (j < n)
        {
            if (sum == B)
            {
                int[] ans = new int[j - i + 1];
                int idx = 0;
                for (int x = i; x<=j; x++)
                    ans[idx++] = A[x];

                return ans;
            }
            else if (sum < B)
            {
                j++;
                if (j < n)
                    sum += A[j];
            }
            else
            {
                sum -= A[i];
                i++;
            }
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {

        int[] A = {5, 10, 20, 100, 105};
        int B = 110;

        for (int x : solve(A,B))
            System.out.print(x + " ");
    }
}
