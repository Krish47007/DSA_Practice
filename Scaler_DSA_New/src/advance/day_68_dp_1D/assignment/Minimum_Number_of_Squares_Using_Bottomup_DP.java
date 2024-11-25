package advance.day_68_dp_1D.assignment;

import java.util.Arrays;

public class Minimum_Number_of_Squares_Using_Bottomup_DP {

    public int countMinSquares(int A) {

        int[] dp = new int[A+1];
        Arrays.fill(dp,-1);

        dp[0] = 0;

        for (int i = 1;i<=A;i++)
        {
            int ans = Integer.MAX_VALUE;

            for (int x = 1; x*x <= i;x++)
                ans = Math.min(ans,dp[i - x * x]);

            dp[i] = ans + 1;
        }

        return dp[A];
    }
}
