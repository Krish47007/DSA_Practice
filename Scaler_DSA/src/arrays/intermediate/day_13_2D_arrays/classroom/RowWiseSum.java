package arrays.intermediate.day_13_2D_arrays.classroom;

public class RowWiseSum {

    private static int[] getRowWiseSum(int[][] mat)
    {
        int[] ans = new int[mat.length];

        for (int i = 0;i < mat.length;i++)
        {
            int sum = 0;
            for (int j = 0; j < mat[i].length;j++)
                sum += mat[i][j];

            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {{4,3,1,7},{6,2,3,4},{5,3,2,7}};

        for (int x : getRowWiseSum(mat))
            System.out.println(x);
    }
}
