package intermediate.day_13_2d_array.assignment;

public class Column_Sum {

    public int[] solve(int[][] A) {

        int m = A.length;
        int n = A[0].length;
        int[] ans = new int[n];
        for (int i = 0;i < n;i++)
        {
            int sum = 0;
            for (int j = 0;j < m;j++)
            {
                sum += A[j][i];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
