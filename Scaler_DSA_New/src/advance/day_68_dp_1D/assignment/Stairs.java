package advance.day_68_dp_1D.assignment;

import java.util.Arrays;

public class Stairs {

    private int calSteps(int n,int[] dp)
    {
        int modVal = 1000000007;
        if (n == 1 || n == 2)
            return n;

        if (dp[n] != -1)
            return dp[n];
        dp[n] = ((calSteps(n-1,dp) % modVal) + (calSteps(n-2,dp))) % modVal;
        return dp[n];
    }

    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return calSteps(n,dp);

    }
}
