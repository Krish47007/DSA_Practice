package intermediate.day_10_prefix_sum.assignment;

public class Range_Sum_Query {

    public long[] rangeSum(int[] A, int[][] B) {

        long pf[] = new long[A.length];
        pf[0] = A[0];
        for (int i = 1;i<A.length;i++)
            pf[i] = pf[i-1] + A[i];

        long[] ans = new long[B.length];

        for (int i = 0;i<B.length;i++)
        {
            int p = B[i][0],q = B[i][1];

            if(p == 0)
                ans[i] = pf[q];
            else
                ans[i] = pf[q] - pf[p-1];
        }
        return ans;
    }
}
