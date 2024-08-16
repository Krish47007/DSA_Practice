package advance.day_32_hashing_1.classroom;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingValue {

    public static int getFirstNonRepeatingValues(int[] arr)
    {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int x : arr)
            freqMap.put(x,freqMap.getOrDefault(x,0) + 1);

        int ans = -1;
        for (int x : arr)
        {
            if(freqMap.get(x) == 1)
            {
                ans = x;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(getFirstNonRepeatingValues(new int[]{1,3,5,1,2,5}));
    }
}
