package intermediate.day_9_intro_to_arrays.assignment;

public class Max_Min_of_an_Array {

    public int solve(int[] arr) {

        int max = arr[0],min = arr[0];

        for (int i = 1;i< arr.length;i++)
        {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }

        return max + min;
    }
}
