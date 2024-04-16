package sorting;

public class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /*
     *   Partition Algo:
     *       1. Choose the 1st element as pivot.
     *       2. Maintain 2 pointers i and j.
     *       3. Swap arr[i] and arr[j] under the following condition.
     *              if(arr[i] > pivot && arr[j] < pivot)
     *       4. When i crosses j we know we found the pos where pivot needs to be so swap arr[beg] and arr[j]
     *       5. Return j as the pos of pivot.
     *
     * */

    static int partition(int[] arr, int beg, int end) {
        int pivot = arr[beg];

        int i = beg + 1, j = end;

        while (i < j) {
            if (arr[i] > pivot && arr[j] < pivot) {
                swap(arr, i, j);

            }
            /*else if(arr[i] < pivot)
                i++;
            else if(arr[j] > pivot)
                j--;*/
            i++;
            j--;
        }

        //swapping pivot and placing it to its right place
        swap(arr, beg, j);

        return j; //as its the new index of pivot
    }

    public static void quickSort(int[] arr, int beg, int end) {

        if (beg < end) {
            int pi = partition(arr, beg, end);
            quickSort(arr, beg, pi);
            quickSort(arr, pi + 1, end);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 70, 20, 40, 80, 34};

        partition(arr, 0, arr.length - 1);
        //quickSort(arr,0,arr.length-1);
        for (int x : arr)
            System.out.print(x + " ");
    }

}
