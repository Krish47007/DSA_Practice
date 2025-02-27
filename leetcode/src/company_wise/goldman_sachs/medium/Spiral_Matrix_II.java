package company_wise.goldman_sachs.medium;

public class Spiral_Matrix_II {

    public static int[][] generateMatrix(int n) {

        int[][] mat = new int[n][n];
        int r = 0, c = 0;
        int k = 1;

        while ( n > 1)
        {
            for (int i = 1; i <= n - 1;i++) {
                mat[r][c] = k++;
                c++;
            }
            for (int i = 1; i <= n-1;i++)
            {
                mat[r][c] = k++;
                r++;
            }
            for (int i = 1; i <= n-1;i++)
            {
                mat[r][c] = k++;
                c--;
            }
            for (int i = 1; i <= n-1;i++)
            {
                mat[r][c] = k++;
                r--;
            }

            r++;
            c++;
            n -= 2;

        }
        if (n == 1)
            mat[r][c] = k;

        return mat;
    }

    public static void main(String[] args) {

        int[][] mat = generateMatrix(6);

        for (int i = 0;i<mat.length;i++)
        {
            for (int j = 0;j<mat[i].length;j++)
                System.out.print(mat[i][j] +" ");

            System.out.println();
        }
    }
}
