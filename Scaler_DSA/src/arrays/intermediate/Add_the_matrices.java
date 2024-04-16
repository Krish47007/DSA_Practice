package arrays.intermediate;

public class Add_the_matrices {

    public int[][] solve(int[][] A, int[][] B) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] += B[i][j];
            }
        }

        return A;
    }
}
