package advance.day_68_dp_1D.classroom;

import java.util.Arrays;

public class Nth_Fibonacci_Num_TopDown_DP {

    /*
        T.C - O(2^N)
        S.C - O(N)
     */
    public static int fib(int n,int[] dp)
    {
        if (n == 0 || n== 1)
            return dp[n] = n;

        int ls = dp[n-1] != -1 ? dp[n-1] : fib(n-1,dp);
        int rs = dp[n-2] != -1 ? dp[n-2] : fib(n-2,dp);

        return dp[n] = ls + rs;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fib(n,dp));
    }
}
