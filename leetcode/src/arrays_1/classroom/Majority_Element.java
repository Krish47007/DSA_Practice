package arrays_1.classroom;

import java.util.Arrays;

public class Majority_Element {

    /*
        This can be solved in O(N) time with HashMap but space complexity will be O(N) as well.
        Below code complexity : O(NLogN), SC - O(1).
        Need to check how we can solve using O(N) and constant space.
     */
    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int curr = nums[0];

        //For array size 1
        if(count > n/2)
            return curr;

        for (int i = 1;i<n;i++)
        {
            if(nums[i] == curr) {
                count++;
                if(count > n/2)
                    return nums[i];
            }
            else
            {
                curr = nums[i];
                count = 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));

    }
}
