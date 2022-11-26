package arrays;

import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Even_Element {

    public static int mostFrequentEven(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int freq = 0;
        int res = -1;
        for(int x: nums)
        {
            if(x%2==0)
            {
                int count = map.getOrDefault(x,0) + 1;

                if(count > freq || (count == freq && x < res))
                {
                    freq = count;
                    res = x;
                }

            }
        }

        return res;

    }

    public static void main(String[] args) {

        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
    }
}
