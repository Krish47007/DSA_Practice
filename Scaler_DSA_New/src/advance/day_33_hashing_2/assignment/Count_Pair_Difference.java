package advance.day_33_hashing_2.assignment;

import java.util.HashMap;
import java.util.Map;

public class Count_Pair_Difference {

    /* A[i] - A[j] = B and i != j

        Let's say A = [ 5,1,3,4,2,6] and B = 1
        Now 5 will make a pair if in the array we have either 6 or 4.
        So we need to check in map freq of A[i] + B and A[i] - B and their occurrence.

     */
    public static int solve(int[] A, int B) {

        Map<Integer,Integer> freqMap = new HashMap<>();
        long count = 0;
        int modVal = 1000000007;

        for (int i = 0;i<A.length;i++)
        {
            if(freqMap.containsKey(A[i] - B))
            {
                count = count + freqMap.get(A[i] - B);
            }
            if(freqMap.containsKey(A[i] + B))
                count = count + freqMap.get(A[i] + B);

            freqMap.put(A[i],freqMap.getOrDefault(A[i],0) + 1);
        }
        return (int)(count % modVal);
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{3,5,1,2},4));
        System.out.println(solve(new int[]{1,2,1,2},1));
    }
}
