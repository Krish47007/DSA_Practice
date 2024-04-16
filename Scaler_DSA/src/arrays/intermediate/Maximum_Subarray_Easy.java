package arrays.intermediate;

public class Maximum_Subarray_Easy {

    public int maxSubarray(int a, int b, int[] c) {

        boolean isSumPossible = false;
        int maxSum = 0;
        for (int x : c) {
            if (x <= b) {
                isSumPossible = true;
            }
        }
        if (!isSumPossible)
            return maxSum;

        for (int i = 0; i < c.length; i++) {
            int sum = 0;
            for (int j = i; j < c.length; j++) {
                sum += c[j];
                if (sum <= b)
                    maxSum = Math.max(maxSum, sum);
                else
                    break;
            }
        }

        return maxSum;
    }
}
