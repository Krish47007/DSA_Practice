package arrays.intermediate;

public class Anti_Diagonals {

    public int[][] diagonal(int[][] A) {

        int n = A.length;
        int[][] ans = new int[2 * n - 1][n];
        int r_idx = 0, c_idx = 0;

        //We are traversing from L-R starting from row 0
        //Outer loop always run till col size.
        //This will print elements starting from row 0 till it reaches col m-1 so
        //left half of the diagonal of the matrix.
        for (int i = 0; i < n; i++) {
            int r = 0, c = i;
            while (r < n && c >= 0) {
                ans[r_idx][c_idx] = A[r][c];
                c_idx++;
                r++;
                c--;
            }
            r_idx++;
            c_idx = 0;
        }
        //The following will print the elements
        //from col m-1 so it prints elements on the right half of the diagonal.
        //starting from 1 as all diagonal elements starting from a[0][n-1] are already printed.
        // r_idx is at n and cIdx at 0 now.
        for (int i = 1; i < n; i++) {
            int r = i, c = n - 1;

            while (r < n && c > 0) {
                ans[r_idx][c_idx] = A[r][c];
                c_idx++;
                r++;
                c--;
            }

            r_idx++;
            c_idx = 0;
        }

        return ans;

    }
}
