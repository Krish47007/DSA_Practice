package advance.day_50_combinatorics.classroom;

import java.util.ArrayList;

public class Pascal_Triangle {

    /*
      Its based on the following combination formula :
            ncr = n-1Cr-1 + n-1Cr
     */
    public static int[][] solve(int n) {

        int[][] ncr = new int[n][];
        for (int i = 0;i<n;i++)
        {
            ncr[i] = new int[i+1];
            ncr[i][0] = 1;
            ncr[i][i] = 1;

            for (int j = 1; j <= i-1;j++)
                ncr[i][j] = ncr[i-1][j-1] + ncr[i-1][j];
        }

        return ncr;
    }

    public static void main(String[] args) {

        for (int[] ans : solve(5))
        {
            for (int x : ans)
                System.out.print(x +" ");
            System.out.println();
        }
    }
}
