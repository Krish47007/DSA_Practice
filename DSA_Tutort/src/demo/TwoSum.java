package demo;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    boolean checkTwoSum(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(k - arr[i]))
                return true;
            else
                set.add(arr[i]);
        }

        return false;
    }
}
