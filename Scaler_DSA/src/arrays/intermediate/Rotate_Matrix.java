package arrays.intermediate;

public class Rotate_Matrix {
    /*
     * To rotate matrix clockwise we need to transpose it first and
     * reverse every row of the matrix
     */

    private void swap(int[][] mat, int i, int j) {
        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
    }

    private void transposeMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++)
                swap(mat, i, j);
        }
    }


    private void reverseRowsInMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int r_idx = i, startColIdx = 0, endColIdx = mat[i].length - 1;
            while (startColIdx < endColIdx) {
                int t = mat[r_idx][startColIdx];
                mat[r_idx][startColIdx] = mat[r_idx][endColIdx];
                mat[r_idx][endColIdx] = t;
                startColIdx++;
                endColIdx--;
            }
        }
    }

    public void solve(int[][] A) {

        transposeMatrix(A);
        reverseRowsInMatrix(A);
    }

    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        var obj = new Rotate_Matrix();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        obj.solve(mat);
        printMatrix(mat);
    }


}
