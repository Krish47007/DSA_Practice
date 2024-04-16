package sorting;

public class HeapSort {

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && arr[largest] < arr[left]) {
            largest = left;
        }

        if (right <= n && arr[largest] < arr[right]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

/*    static void heapSort(int[] arr)
    {
        int n = arr.length;

        for(int i =)
    }*/
}
