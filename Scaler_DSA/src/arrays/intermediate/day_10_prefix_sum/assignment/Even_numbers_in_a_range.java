package arrays.intermediate.day_10_prefix_sum.assignment;

public class Even_numbers_in_a_range {

    public int[] solve(int[] A, int[][] B) {

        int[] countEven = new int[A.length];
        int[] ans = new int[B.length];

        countEven[0] = A[0] %2 == 0 ? 1 : 0;
        //creating count even array
        for (int i = 1;i<A.length;i++)
            countEven[i] = countEven[i-1] + ((A[i] %2 == 0) ? 1 : 0);

        for (int i = 0;i<B.length;i++)
        {
            int p = B[i][0];
            int q = B[i][1];

            ans[i] = ( p == 0 )? countEven[q] : (countEven[q] - countEven[p-1]);
        }

        return ans;
    }
}
