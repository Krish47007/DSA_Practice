package arrays_1.classroom;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Even_Element {

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

        for (int i = 0;i< nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                int occ = map.get(nums[i]);
                if(occ > freq) {
                    mostOccurringEvenNum = nums[i];
                    freq = occ;
                }
                else if(occ == freq)
                {
                    mostOccurringEvenNum = Math.min(mostOccurringEvenNum,nums[i]);
                }
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
