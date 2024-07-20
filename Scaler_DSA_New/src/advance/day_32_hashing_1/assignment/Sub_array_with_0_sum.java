package advance.day_32_hashing_1.assignment;

import java.util.HashSet;
import java.util.Set;

public class Sub_array_with_0_sum {

    public static int solve(int[] A) {

        /*
        *  We can use prefix sum for sub-array sum.Now if there exists a sub array with 0 sum means
        *  in pf array, below are two cases
        *       1. pf[i,j] = pf[j] - pf[i-1] must be 0 so pf[i-1] = pf[j].
        *       2. pf[i] = 0
        * we have to look for this 2 cases.
        * */

        Set<Long> set = new HashSet<>();
        long[] pf = new long[A.length];
        pf[0] = A[0];

        if(pf[0] == 0)
            return 1;

        set.add(pf[0]);

        for (int i = 1;i < A.length;i++)
        {
            pf[i] = pf[i-1] + A[i];
            if(pf[i] == 0)
                return 1;
            if(!set.add(pf[i]))
                return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{1, 2, 3, 4, 5}));

        System.out.println(solve(new int[]{4,-1,1}));

        System.out.println(solve(new int[]{4,-1,2,3,-5}));
    }
}
