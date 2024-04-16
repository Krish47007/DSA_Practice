package demo;

public class ReverseSubArray {

    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    void reverseArray(int[] arr, int p1, int p2) {
        while (p1 < p2) {
            swap(arr, p1++, p2--);
        }
    }

    void reverseSubArray(int[] arr, int start, int end) {
        reverseArray(arr, start, end);
    }
}
