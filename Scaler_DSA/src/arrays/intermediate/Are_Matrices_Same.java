package arrays.intermediate;

public class Are_Matrices_Same {

    public int solve(int[][] A, int[][] B) {

        int ans = 0;
        int n1 = A.length, n2 = B.length;
        int m1 = A[0].length, m2 = B[0].length;

        if (n1 != n2 || m1 != m2)
            return ans;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                if (A[i][j] != B[i][j])
                    return ans;
            }
        }

        return ans = 1;

    }
}
