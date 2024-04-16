package hashing;

import java.util.HashSet;
import java.util.Set;

public class Sub_array_with_0_sum {

    public int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        long[] pf = new long[A.length];
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++)
            pf[i] = pf[i - 1] + A[i];

        Set<Long> set = new HashSet<>();
        for (int i = 0; i < pf.length; i++) {
            if (set.contains(pf[i]) || pf[i] == 0)
                return 1;
            set.add(pf[i]);
        }

        return 0;

    }
}
