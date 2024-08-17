package advance.day_33_hashing_2.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfUniqueElements_InWindowSize_K {

    public static int[] getCount(int[] arr,int k)
    {
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

    public static void main(String[] args) {

        int[] arr = {1,2,1,3,4,2,3};
        int k = 4;

        for (int x : getCount(arr,k))
            System.out.print(x + " ");

    }
}
