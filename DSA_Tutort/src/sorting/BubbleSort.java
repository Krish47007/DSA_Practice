package sorting;

public class BubbleSort {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 1, 1, 2, 2, 0, 0};

        bubbleSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
