package advance.day_21_2D_array.assignment;

public class Spiral_Order_Matrix_2 {

    public static int[][] generateMatrix(int n) {

        int r = 0,c = 0;
        int[][] ans = new int[n][n];
        int k = 1;
        while (n > 1)
        {
            for (int i = 1;i <= n-1;i++)
            {
                ans[r][c] = k++;
                c++;
            }
            for (int i = 1;i <= n-1;i++)
            {
                ans[r][c] = k++;
                r++;
            }
            for (int i = 1;i <= n-1;i++)
            {
                ans[r][c] = k++;
                c--;
            }
            for (int i = 1;i <= n-1;i++)
            {
                ans[r][c] = k++;
                r--;
            }

            r++;
            c++;
            n -= 2;
        }

        if(n == 1)
            ans[r][c] = k;

        return ans;
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
