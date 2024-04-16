package arrays.intermediate;

public class Column_Sum {

    public int[] solve(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += mat[j][i];
            }
            ans[i] = sum;
        }

        return ans;

    }
}
