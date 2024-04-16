package sorting;

import java.util.ArrayList;

public class Sort_by_Color {

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public int[] sortColors(int[] arr) {

        /*
         *   We are going to maintain 3 pointers - low, mid, high
         *   low points to the pos before which all are zeroes in array.
         *   high points to the starting point in array from where all are 2s.
         *   mid explores the unknown area.
         */

        int low, mid, high;
        low = mid = 0;
        high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 1)
                mid++;
            else if (arr[mid] == 0) {
                swap(arr, low, mid);
                mid++;
                low++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        var obj = new Sort_by_Color();
        int[] arr = obj.sortColors(new int[]{0, 1, 2, 0, 1, 2});

        for (int x : arr)
            System.out.print(x + " ");
    }
}
