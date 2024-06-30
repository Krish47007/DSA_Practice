package advance.day_21_2D_array.assignment;

public class Sum_of_all_Submatrices {

    public static int solve(int[][] A) {

        int ans = 0;
        int n = A.length;
        for (int i = 0;i<n;i++)
        {
            for (int j = 0;j<n;j++)
            {
                ans += A[i][j] * (i+1) * (j+1) * (n-i) * (n-j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = { {1,2},{3,4}};

        System.out.println(solve(mat));
    }
}
