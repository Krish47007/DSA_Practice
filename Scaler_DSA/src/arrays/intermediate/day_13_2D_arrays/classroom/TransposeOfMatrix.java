package arrays.intermediate.day_13_2D_arrays.classroom;

public class TransposeOfMatrix {

    static int[][] transpose(int[][] mat)
    {
        int m = mat.length, n = mat[0].length;
        if (m != n)
            throw new IllegalArgumentException("Not a square matrix");

        for (int i = 0;i<n;i++)
        {
            for (int j = i+1;j<n;j++)
                swap(mat,i,j);
        }
        return mat;
    }

    private static void swap(int[][] mat, int i, int j) {

        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
    }

    public static void main(String[] args) {

        int[][] mat = transpose(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,3,2,1},
                {6,7,2,4}
        });

        for (int i = 0;i< mat.length;i++)
        {
            for (int j = 0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}
