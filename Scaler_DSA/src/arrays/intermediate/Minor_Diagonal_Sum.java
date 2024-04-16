package arrays.intermediate;

public class Minor_Diagonal_Sum {

    public int solve(final int[][] A) {

        //Same as right diagonal
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][A.length - 1 - i];
        }

        return sum;
    }
}
