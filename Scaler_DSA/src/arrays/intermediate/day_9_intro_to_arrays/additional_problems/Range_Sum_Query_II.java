package arrays.intermediate.day_9_intro_to_arrays.additional_problems;

public class Range_Sum_Query_II {

    public int[] solve(int[] A, int[][] B) {

        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        int[] ans = new int[B.length];

        for (int i = 1;i<A.length;i++)
            prefixSum[i] = prefixSum[i-1] + A[i];

        for (int i = 0;i<B.length;i++)
        {
            int p = B[i][0];
            int q = B[i][1];

            ans[i] = (p==0) ? prefixSum[q] : prefixSum[q] - prefixSum[p-1];
        }
        return ans;
    }
}
