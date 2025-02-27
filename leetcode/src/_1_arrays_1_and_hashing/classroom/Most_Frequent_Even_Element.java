package _1_arrays_1_and_hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Even_Element {

    public static int mostFrequentEven_better(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int val = Integer.MAX_VALUE, freq = 0;

        for (var i : nums)
        {
            //if even
            if( (i & 1) == 0)
            {
                //Update in map
                int curr = map.getOrDefault(i,0) + 1;
                map.put(i,curr);

                //update smallest with great frequency
                if(curr > freq || (curr == freq && i < val))
                {
                    val = i;
                    freq = curr;
                }
            }
        }

        return freq == 0 ? -1 : val;
    }

    public static int mostFrequentEven(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int x : nums)
        {
            if( x % 2 == 0)
            {
                map.put(x,map.getOrDefault(x,0) + 1);
            }
        }

        if(map.isEmpty())
            return -1;

        int mostOccurringEvenNum = -1,freq = 0;

        for (int x : map.keySet())
        {
            if(map.get(x) > freq)
            {
                mostOccurringEvenNum = x;
                freq = map.get(x);
            }
            else if(map.get(x) == freq)
            {
                mostOccurringEvenNum = Math.min(mostOccurringEvenNum,x);
            }

        }
        return mostOccurringEvenNum;

    }

    public static void main(String[] args) {

        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
    }
}
