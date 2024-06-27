package advance.day_21_2D_array.assignment;

public class Search_in_a_row_wise_and_column_wise_sorted_matrix {

    public static int solve(int[][] A, int B) {

        int n = A.length, m = A[0].length;
        int r = 0,c = m-1;
        int ans = Integer.MAX_VALUE;
        while (r < n && c >= 0)
        {
            if(A[r][c] == B) {
                ans = Math.min(ans, ((r + 1) * 1009 + (c + 1)));
                //in left side of same row may have the same value
                // that may reduce overall ans.
                if( c != 0 && A[r][c-1] == B)
                    c--;
                else
                    return ans;
            }
            else if( A[r][c] < B)
                r++;
            else
                c--;
        }
        return -1;
    }

    public static void main(String[] args) {

/*        int A[][] = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int B = 2;*/

        int A[][] = new int[][]{
                {2,8,8,8},
                {2,8,8,8},
                {2,8,8,8}
        };
        int B = 8;

        System.out.println(solve(A,B));
    }
}
