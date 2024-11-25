package advance.day_68_dp_1D.assignment;

import java.util.Arrays;

public class Minimum_Number_of_Squares {

    private int countMinSQ(int n,int[] dp)
    {
        if (n == 0)
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int x = 1; x * x <=n; x++)
        {
            ans = Math.min(ans, dp[n - x*x] != -1 ? dp[n - x*x] : countMinSQ(n - x*x, dp));
        }
        return dp[n] = ans + 1; //Current number is considered
    }
    public int countMinSquares(int A) {

        int[] dp = new int[A+1];
        Arrays.fill(dp,-1);
        return countMinSQ(A,dp);
    }
}
