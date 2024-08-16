package intermediate.day_12_sliding_window_contribution_technique.assignment;

public class Subarray_with_given_sum_and_length {

    public static int solve(int[] A, int B, int C) {

        int n = A.length;
        int maxSum = 0;
        if( B > n )
            return 0;
        else if(B == n)
        {
            for (int i = 0;i<n;i++)
                maxSum += A[i];

            if (maxSum == C)
                return 1;
        }
        else
        {
            int sum = 0;
            for (int i = 0;i<B;i++)
                sum += A[i];

            if(sum == C)
                return 1;
            int s = 0;

            for (int i = B;i<=n-B;i++)
            {
                sum = sum - A[s];
                sum = sum + A[i];
                if(sum == C)
                    return 1;

                s++;
            }

        }
        return 0;
    }

    public static void main(String[] args) {

        int[] A = {8,7,7,6,6,3,1,5,7};
        int B = 1;
        int C = 2;

        System.out.println(solve(A,B,C));
    }
}
