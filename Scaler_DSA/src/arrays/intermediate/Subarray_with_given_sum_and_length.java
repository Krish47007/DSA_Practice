package arrays.intermediate;

public class Subarray_with_given_sum_and_length {

    public int solve(int[] A, int B, int C) {

        int sum = 0, ans = 0;
        for (int i = 0; i < B; i++)
            sum += A[i];

        if (sum == C)
            return ans = 1;

        //Start and end index of window
        int s = 1, e = B;
        while (e < A.length) {
            sum -= A[s - 1];
            sum += A[e];
            if (sum == C)
                return ans = 1;
            s++;
            e++;
        }

        return ans;
    }
}
