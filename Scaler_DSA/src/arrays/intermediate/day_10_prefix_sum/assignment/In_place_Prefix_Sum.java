package arrays.intermediate.day_10_prefix_sum.assignment;

public class In_place_Prefix_Sum {

    public int[] solve(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }
}
