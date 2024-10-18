package advance.day_50_combinatorics.assignment;

import java.util.HashMap;
import java.util.Map;

public class NcR_mod_m {

/*
    //GOT TLE with this approach - we need to go for memoization and DP
    private static int calNcr(int n, int r, int m, Map<Integer, Integer> ncrMap)
    {
        if(r == n || r == 0)
            return 1;
        if( r == 1)
            return n;

        return calNcr(n-1,r-1,m, ncrMap) + calNcr(n-1,r,m, ncrMap);
    }
    public static int solve(int n, int r, int m) {

        if( r > n)
            return 0;
        Map<Integer,Integer> ncrMap = new HashMap<>();
        return calNcr(n,n-r,m,ncrMap) % m; //nCr = nCn-r
    }*/

    public static int calNcr(int n,int r ,int m)
    {
        int[][] ncr = new int[n+1][r+1];

        for (int i = 0;i<=n;i++)
        {
            for (int j = 0;j<=Math.min(i,r);j++)
            {
                if(j == 0 || j == i)
                    ncr[i][j] = 1;
                else
                    ncr[i][j] = (ncr[i-1][j-1] % m+ ncr[i-1][j] % m) % m;
            }
        }

        return ncr[n][r];

    }
    public static int solve(int n, int r, int m) {

        if( r > n)
            return 0;

        return calNcr(n,r,m); //nCr = nCn-r
    }


    public static void main(String[] args) {

        System.out.println(solve(5,2,13));
        System.out.println(solve(6,2,13));
    }
}
