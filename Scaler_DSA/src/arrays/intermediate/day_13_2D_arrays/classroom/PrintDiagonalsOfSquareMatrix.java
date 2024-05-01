package arrays.intermediate.day_13_2D_arrays.classroom;

public class PrintDiagonalsOfSquareMatrix {

    private static void printAllDiagonals(int[][] mat)
    {
        int n = mat.length;
        //printing left diagonals
        for (int i = 0;i<n;i++)
            System.out.print(mat[i][i]+" ");

        System.out.println();

        //Printing right diagonal
        for (int i = 0;i<n;i++)
            System.out.print(mat[i][n-i-1]+" ");
    }

    public static void main(String[] args) {

        int[][] mat = { {4,3,1},
                        {6,2,3},
                        {5,3,2}
                      };

        printAllDiagonals(mat);
    }
}
