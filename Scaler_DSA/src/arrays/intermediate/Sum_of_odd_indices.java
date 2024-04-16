package arrays.intermediate;

public class Sum_of_odd_indices {

    public int[] sumPrefix(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                prefixSum[i] = prefixSum[i - 1];
            } else
                prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public int[] solve(int[] A, int[][] B) {

        int q = B.length;
        int[] oddPrefix = sumPrefix(A);
        int[] ans = new int[q];
        int idx = 0;
        for (int i = 0; i < q; i++) {
            int m = B[i][0], n = B[i][1];

            if (m == 0)
                ans[idx++] = oddPrefix[n];
            else
                ans[idx++] = oddPrefix[n] - oddPrefix[m - 1];

        }
        return ans;
    }
}
