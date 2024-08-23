package arrays_1.assignment;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
            }
            else
                map.put(nums[i],i);

        }
        return ans;
    }

    public static void main(String[] args) {

        for (int x : twoSum(new int[]{2,7,11,15},9))
            System.out.print(x + " ");
    }
}
