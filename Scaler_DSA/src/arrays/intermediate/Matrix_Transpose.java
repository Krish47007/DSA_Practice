package arrays.intermediate;

public class Matrix_Transpose {
/*

    private void swap(int[][]mat,int i ,int j)
    {
        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
    }
*/

    public static int[][] solve(int[][] mat) {

        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[m][n];


        for (int i = 0; i < m; i++) {
            int r_idx = i, c_idx = 0;
            for (int j = 0; j < n; j++)
                ans[r_idx][c_idx++] = mat[j][i];
        }

        return ans;
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] ans = solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        printMatrix(ans);
    }
}
