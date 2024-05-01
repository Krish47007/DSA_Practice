package arrays.intermediate.day_13_2D_arrays.classroom;

public class PrintAllDiagonalsFromRightToLeft {

    /*
     We are traversing through every element of the array exactly once
     so TC is O(M * N), SC - O(1)
     */

   private static void printAllDiagonals(int[][] mat)
    {
        int nRows = mat.length,nCols = mat[0].length;

        //First row elements as starting point
        for (int i = 0; i < nCols - 1;i++)
        {
            int p = 0, q = i;

            while (p < nRows && q >= 0)
            {
                System.out.print(mat[p][q]+" ");
                p++;
                q--;
            }
            System.out.println();
        }

        //Last column elements as starting elements
        for (int i = 0; i < nRows;i++)
        {
            int p = i, q = nCols - 1;

            while (p < nRows && q >= 0)
            {
                System.out.print(mat[p][q]+" ");
                p++;
                q--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

       printAllDiagonals(new int[][]{
               {5,6,2,1},
               {7,5,10,5},
               {3,4,9,8}
       });
    }
}
