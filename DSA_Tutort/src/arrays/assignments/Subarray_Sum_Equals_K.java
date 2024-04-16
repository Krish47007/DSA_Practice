package arrays.assignments;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> cache = new HashMap<>();
        int currSum = 0, count = 0;

        for (int x : nums) {
            // current prefix sum
            currSum += x;

            // situation 1:
            // continuous subarray starts
            // from the beginning of the array
            if (currSum == k)
                count++;

            // situation 2:
            // number of times the curr_sum − k has occured already,
            // determines the number of times a subarray with sum k
            // has occured upto the current index
            count += cache.getOrDefault(currSum - k, 0);

            // add the current sum
            cache.put(currSum, cache.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
