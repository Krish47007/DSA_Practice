package arrays.intermediate.day_9_intro_to_arrays.assignment;

public class Reverse_the_Array {

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

    public int[] solve(final int[] arr) {

        reverse(arr, 0, arr.length - 1);
        return arr;
    }
}
