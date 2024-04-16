package arrays.intermediate.day_10_prefix_sum.assignment;

public class Range_Sum_Query {

    public long[] rangeSum(int[] A, int[][] B) {

        long[] ans = new long[B.length];
        long[] pf = new long[A.length];
        pf[0] = A[0];

        //creating pf sum
        for (int i = 1;i<A.length;i++)
            pf[i] = pf[i-1] + A[i];

        for (int i = 0;i<B.length;i++)
        {
            int p = B[i][0];
            int q = B[i][1];

            ans[i] = (p == 0) ? pf[q] : (pf[q] - pf[p-1]);
        }
        return ans;
    }
}
