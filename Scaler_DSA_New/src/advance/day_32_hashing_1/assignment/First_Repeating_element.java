package advance.day_32_hashing_1.assignment;

import java.util.HashMap;
import java.util.Map;

public class First_Repeating_element {

    public int solve(int[] A) {

        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int x : A)
        {
            freqMap.put(x,freqMap.getOrDefault(x,0) + 1);
        }

        int ans = -1;
        for (int x : A)
        {
            if(freqMap.get(x) > 1)
            {
                ans = x;
                break;
            }
        }
        return ans;
    }
}
