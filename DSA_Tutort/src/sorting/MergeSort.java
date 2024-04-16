package sorting;

public class MergeSort {

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int res[] = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            res[k++] = nums1[i++];
        }
        while (j < n)
            res[k++] = nums2[j++];

        return res;
    }

    static void mergeSort(int[] arr, int beg, int end) {
        if (beg <= end) {
            int mid = beg + (end - beg) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            //  merge(arr,beg,end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 2, 0, 0};

        mergeSort(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
