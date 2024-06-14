package intermediate.day_13_2d_array.assignment;

public class Matrix_Transpose {

    private static void swap(int[][] arr,int i,int j)
    {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static int[][] solve(int[][] A) {

        int m = A.length, n = A[0].length;
        int[][] transpose = new int[n][m];

        for (int i = 0;i < m;i++)
        {
            for (int j = 0;j<n;j++)
            {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;

    }

    public static void main(String[] args) {

        int[][] mat = {
                {21,62,16,44,55,100,16,86,29},
                {62,72,85,35,14,1,89,15,73},
                {42,44,30,56,25,52,61,23,54},
                {2,65,65,82,26,36,66,60,1}
        };

        mat = solve(mat);

        for (int i = 0;i<mat.length;i++)
        {
            for (int j = 0;j<mat[i].length;j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

}
