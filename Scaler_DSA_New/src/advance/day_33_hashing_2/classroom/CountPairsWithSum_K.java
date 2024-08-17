package advance.day_33_hashing_2.classroom;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithSum_K {

    // find no. of pairs where arr[i] + arr[j] == k and i != j
    public static int countPairs(int[] arr,int k)
    {
        Map<Integer,Integer> freqMap = new HashMap<>();
        int count = 0;
        for (int x : arr)
        {
            if(freqMap.containsKey(k - x))
                count += freqMap.get(k-x);
            freqMap.put(x,freqMap.getOrDefault(x,0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {8,9,2,-2,4,5,-2,5,2};
        System.out.println(countPairs(arr,7));
    }
}
