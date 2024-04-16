package arrays.intermediate.day_9_intro_to_arrays.additional_problems;

public class Max_Min_of_an_Array {

    public int solve(int[] arr) {

        int min = arr[0],max = arr[0];

        for (int i = 0;i<arr.length;i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        return min + max;
    }
}
