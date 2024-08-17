package advance.day_33_hashing_2.assignment;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_Zero_Sum {

    /*
        Sub array sum can be 0 if
            1. pf[i] == 0 or
            2. pf[R] - pf[L-1] = 0 => pf[R] = pf[L-1]

            So compare the lengths and take max as answer.
     */
    public static int solve(int[] A) {

        Map<Long,Integer> map = new HashMap<>();
        long pfSum = 0;
        int maxSize = 0;
        for (int i = 0;i<A.length;i++)
        {
            pfSum += A[i];
            if(pfSum == 0)
                maxSize = Math.max(maxSize,i+1);
            else if(map.containsKey(pfSum))
            {
                int l = map.get(pfSum) + 1;
                int r = i;
                maxSize = Math.max(maxSize,r-l+1);
                //No need to update pfSum's index as we already have same value from previous iterations and we need max sub array
                continue;
            }
            map.put(pfSum,i);
        }
        return maxSize;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{1, -2, 1, 2}));
        System.out.println(solve(new int[]{3,2,-1}));
    }
}
