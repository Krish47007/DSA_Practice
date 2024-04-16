package arrays.intermediate.day_9_intro_to_arrays.assignment;

import java.util.HashSet;
import java.util.Set;

public class Good_Pair {
/*
    public int solve(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(k - arr[i]))
                return 1;
            else
                set.add(arr[i]);

        }

        return 0;
    }*/

    public int solve(int[] arr, int k) {

        for (int i = 0;i<arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == k)
                    return 1;
            }
        }
        return 0;
    }
}
