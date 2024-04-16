package arrays.intermediate.day_9_intro_to_arrays.assignment;

public class Reverse_in_a_range {

    private void swap(int[] arr, int i, int j) {

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private void reverse(int[] arr, int beg, int end) {
        if (beg > end)
            return;

        while (beg < end)
            swap(arr, beg++, end--);
    }

    public int[] solve(int[] A, int B, int C) {

        reverse(A, B, C);
        return A;
    }
}
