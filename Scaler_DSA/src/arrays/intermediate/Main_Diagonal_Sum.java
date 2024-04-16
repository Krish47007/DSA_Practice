package arrays.intermediate;

public class Main_Diagonal_Sum {

    public int solve(final int[][] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][i];
        }
        return sum;
    }
}
