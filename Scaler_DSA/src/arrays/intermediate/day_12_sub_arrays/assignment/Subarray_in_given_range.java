package arrays.intermediate.day_12_sub_arrays.assignment;

public class Subarray_in_given_range {

    public int[] solve(int[] arr, int b, int c) {

        int[] subArr = new int[c - b + 1];
        int idx = 0;
        for (int i = b; i <= c; i++)
            subArr[idx++] = arr[i];

        return subArr;
    }
}
