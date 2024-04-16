package arrays.intermediate.day_9_intro_to_arrays.assignment;

public class Array_Rotation {

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

    public int[] solve(int[] arr, int k) {

        int n = arr.length;
        k = k % arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return arr;
    }
}
