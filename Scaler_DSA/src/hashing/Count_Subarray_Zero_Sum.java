package hashing;

import java.util.HashSet;
import java.util.Set;

public class Count_Subarray_Zero_Sum {

    public int solve(int[] A) {

        long[] pf = new long[A.length];
        pf[0] = A[0];
        for (int i = 1; i < A.length; i++)
            pf[i] = pf[i - 1] + A[i];

        Set<Long> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < pf.length; i++) {
            if (set.contains(pf[i]) || pf[i] == 0)
                count = (count + 1) % ((int) Math.pow(10, 9) + 1);
            set.add(pf[i]);
        }

        return count;
    }

    public static void main(String[] args) {
        var obj = new Count_Subarray_Zero_Sum();
        System.out.println(obj.solve(new int[]{30, -30, 30, -30}));
    }
}
