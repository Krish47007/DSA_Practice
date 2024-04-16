package arrays;

public class Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int p = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p--] = nums1[i--];
            } else
                nums1[p--] = nums2[j--];
        }

        while (i >= 0)
            nums1[p--] = nums1[i--];

        while (j >= 0)
            nums1[p--] = nums2[j--];
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};

        merge(a, 0, b, 3);

        for (int x : a)
            System.out.print(x + " ");
    }
}
