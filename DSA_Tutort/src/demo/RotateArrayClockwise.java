package demo;

public class RotateArrayClockwise {

    void rotateArrayClockwise(int[] arr, int k) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
}
