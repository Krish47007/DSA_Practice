package advance.day_21_2D_array.assignment;

public class Row_with_maximum_number_of_ones {

    public int solve(int[][] A) {

        int n = A.length;
        int r = 0,c = n-1;//square matrix given
        int ans = 0;
        while(r < n && c >= 0)
        {
            //check left for more 1s
            while (c >= 0 && A[r][c] == 1) {
                c--;
                ans = r;
            }
            r++;
        }

        return ans;
    }
}
