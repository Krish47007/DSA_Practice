package arrays.intermediate.day_9_intro_to_arrays.additional_problems;

public class Time_to_equality {

    public int solve(int[] arr) {

        int max = -1;

        for (int i = 0;i<arr.length;i++)
            max = Math.max(max,arr[i]);

        int totalTime = 0;

        for (int i = 0;i<arr.length;i++)
            totalTime = totalTime + (max - arr[i]);

        return totalTime;

    }
}
