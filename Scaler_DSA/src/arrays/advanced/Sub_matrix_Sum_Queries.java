package arrays.advanced;

public class Sub_matrix_Sum_Queries {

    public long[][] getPrefixSum(int[][] mat) {
        //Assuming m*n matrix
        long[][] pf = new long[mat.length][mat[0].length];
        int mod = 1000000007;
        //Calculate pf for 1st row and 1st col
        pf[0][0] = mat[0][0];
        for (int i = 1; i < mat[0].length; i++)
            pf[0][i] = (pf[0][i - 1] + mat[0][i]) % mod;

        for (int i = 1; i < mat.length; i++)
            pf[i][0] = (pf[i - 1][0] + mat[i][0]) % mod;

        /*
         * Now we cal pf from (1,1) to (m,n) using the following formula :
         *   pf[i][j] = mat[i][j] + pf[i-1][j] + pf[i][j-1] - pf[i-1][j-1];
         */

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                pf[i][j] = (mat[i][j] + pf[i - 1][j] + pf[i][j - 1] - pf[i - 1][j - 1]) % mod;
            }
        }
        return pf;

    }

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        long[][] pf = getPrefixSum(A);
        int[] ans = new int[B.length];
        int mod = 1000000007;

        for (int i = 0; i < B.length; i++) {
            int Sx = B[i] - 1, Sy = C[i] - 1;
            int Ex = D[i] - 1, Ey = E[i] - 1;

            long sum = pf[Ex][Ey] % mod;
            if (Sx > 0 && Sy > 0) {
                sum = (sum - pf[Sx - 1][Ey] - pf[Ex][Sy - 1] + pf[Sx - 1][Sy - 1]) % mod;
            } else if (Sx == 0 && Sy == 0)
                sum = pf[Ex][Ey] % mod;
            else if (Sx == 0)
                sum = (sum - pf[Ex][Sy - 1]) % mod;
            else if (Sy == 0) {
                sum = (sum - pf[Sx - 1][Ey]) % mod;
            }

            if (sum < 0)
                sum += mod;
            ans[i] = (int) sum;
        }
        return ans;
    }
}
