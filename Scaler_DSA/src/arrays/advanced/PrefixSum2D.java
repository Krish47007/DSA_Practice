package arrays.advanced;

public class PrefixSum2D {

    public int[][] getPrefixSum(int[][] mat) {
        //Assuming m*n matrix
        int[][] pf = new int[mat.length][mat[0].length];

        //Calculate pf for 1st row and 1st col
        pf[0][0] = mat[0][0];
        for (int i = 1; i < mat[0].length; i++)
            pf[0][i] = pf[0][i - 1] + mat[0][i];

        for (int i = 1; i < mat.length; i++)
            pf[i][0] = pf[i - 1][0] + mat[i][0];

        /*
         * Now we cal pf from (1,1) to (m,n) using the following formula :
         *   pf[i][j] = mat[i][j] + pf[i-1][j] + pf[i][j-1] - pf[i-1][j-1];
         */

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                pf[i][j] = mat[i][j] + pf[i - 1][j] + pf[i][j - 1] - pf[i - 1][j - 1];
            }
        }
        return pf;

    }

    void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        var obj = new PrefixSum2D();
        int[][] mat = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {4, 8, 6, 1}};
        obj.display(mat);
        System.out.println();
        obj.display(obj.getPrefixSum(mat));
    }
}
