package arrays.intermediate.day_13_2D_arrays.classroom;

public class RotateMatrix90DegreeClockWise {

    private static int[][] rotateClockWise(int[][] mat)
    {
        mat = transpose(mat);

        for (int i = 0;i<mat.length;i++)
        {
            reverseArray(mat[i],0,mat[i].length-1);
        }

        return mat;
    }

    private static void reverseArray(int[] arr,int beg,int end)
    {
        while (beg < end)
        {
            int t = arr[beg];
            arr[beg] = arr[end];
            arr[end] = t;
            beg++;
            end--;
        }
    }

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

        int[][] mat = rotateClockWise(new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        });

        for (int i = 0;i< mat.length;i++)
        {
            for (int j = 0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
}
