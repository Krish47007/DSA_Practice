package arrays.intermediate;

public class Row_to_Column_Zero {

    private void makeRowColZero(int[][] mat, int i, int j) {
        //make ith row 0
        for (int k = 0; k < mat.length; k++) {
            //Making it -1 otherwise we will loose actual array info
            if (mat[i][k] != 0)
                mat[i][k] = -1;
        }
        for (int k = 0; k < mat.length; k++) {
            if (mat[k][j] != 0)
                mat[k][j] = -1;
        }
    }

    public int[][] solve(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0)
                    makeRowColZero(A, i, j);
            }
        }

        //Making all -1 to 0 before returning
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == -1)
                    A[i][j] = 0;
            }
        }
        return A;
    }

    public static void main(String[] args) {


    }
}
