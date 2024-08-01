package advance.day_33_hashing_2.assignment;

import java.util.HashMap;
import java.util.Map;

public class Count_Pair_Difference {

    public static int solve(int[] A, int B) {

        Map<Integer,Integer> freqMap = new HashMap<>();
        int count = 0;
        int modVal = 100000007;
        for (int i = A.length - 1;i>=0;i--)
        {
            freqMap.put(A[i],freqMap.getOrDefault(A[i],0) + 1);
        }

        for (int i = 0;i<A.length;i++)
        {
            if(freqMap.containsKey(B - A[i])) {
                count = count + freqMap.get(B - A[i]);
                freqMap.remove(B - A[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{3,5,1,9,3,7},4));
        System.out.println(solve(new int[]{3,5,1,2},4));
    }
}
