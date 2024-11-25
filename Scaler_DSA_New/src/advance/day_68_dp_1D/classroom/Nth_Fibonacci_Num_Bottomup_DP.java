package advance.day_68_dp_1D.classroom;

import java.util.Arrays;

public class Nth_Fibonacci_Num_Bottomup_DP {

    public static int fib(int n)
    {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2;i<=n;i++)
            dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }


    //Further space can be optimised as we see that result depends on previous two results always
    public static int fib_2(int n)
    {
        if(n == 0 || n == 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2;i<=n;i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }
}
