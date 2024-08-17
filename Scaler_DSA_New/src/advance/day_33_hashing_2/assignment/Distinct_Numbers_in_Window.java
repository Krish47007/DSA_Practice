package advance.day_33_hashing_2.assignment;

import java.util.HashMap;
import java.util.Map;

public class Distinct_Numbers_in_Window {

    public int[] dNums(int[] arr, int k) {

        Map<Integer,Integer> freqMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0;i<k;i++)
        {
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0) + 1);
        }

        int[] ans = new int[n-k+1];
        int idx = 0;
        ans[idx++] = freqMap.size();

        int start = 0;

        for (int i = k;i<n;i++)
        {
            if(freqMap.containsKey(arr[start]))
            {
                int val = freqMap.get(arr[start]);
                val--;
                if(val == 0)
                    freqMap.remove(arr[start]);
                else
                    freqMap.put(arr[start],val);
            }
            start++;
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0) + 1);
            ans[idx++] = freqMap.size();
        }
        return ans;
    }
}
