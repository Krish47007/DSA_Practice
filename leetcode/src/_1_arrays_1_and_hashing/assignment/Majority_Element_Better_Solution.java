package _1_arrays_1_and_hashing.assignment;

public class Majority_Element_Better_Solution {

        public int majorityElement(int[] nums) {

            if(nums.length == 1)
                return nums[0];

            int majorityElement = nums[0], votes = 1;

            for (int i = 1;i< nums.length;i++)
            {
                if (nums[i] == majorityElement)
                    votes++;
                else
                    votes--;

                if (votes == 0)
                {
                    majorityElement = nums[i];
                    votes = 1;
                }
            }
            // As majority is guaranteed so we can safely return
            return majorityElement;
        }
}
