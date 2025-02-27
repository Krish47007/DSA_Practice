package _1_arrays_1_and_hashing.assignment;

import java.util.Arrays;


public class Majority_Element {

        public int majorityElement(int[] nums) {

            int n = nums.length;

            if (n == 1)
                return nums[0];

            Arrays.sort(nums);
            int count = 1;
            int curr = nums[0];

            for (int i = 1; i < n; i++)
            {
                if (nums[i] == curr)
                {
                    count++;
                    if (count > n/2)
                        return curr;
                }
                else
                {
                    curr = nums[i];
                    count = 1;
                }
            }
            return  -1;
        }
}
