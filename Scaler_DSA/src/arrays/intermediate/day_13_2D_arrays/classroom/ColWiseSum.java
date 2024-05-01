package arrays.intermediate.day_13_2D_arrays.classroom;

public class ColWiseSum {
    private static int[] getColWiseSum(int[][] mat)
    {
        int nRows = mat.length, nCols = mat[0].length;
        int[] ans = new int[nCols];
        for (int i = 0; i < nCols;i++)
        {
            int sum = 0;
            for (int j = 0; j < nRows;j++)
                sum += mat[j][i];

            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {{4,3,1,7},{6,2,3,4},{5,3,2,7}};

        for (int x : getColWiseSum(mat))
            System.out.println(x);
    }
}
