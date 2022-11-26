package arrays;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0;i< nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            else
                map.put(nums[i],i);
        }

        return res;
    }

    public static void main(String[] args) {

        for(int x : twoSum(new int[]{2,7,11,15},9))
            System.out.println(x+" ");
    }
}
