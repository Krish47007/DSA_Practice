package _1_arrays_1_and_hashing.assignment;

public class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int p = nums1.length - 1;

        while ( i >= 0 && j >=0)
        {
            if (nums1[i] <= nums2[j])
                nums1[p--] = nums2[j--];
            else
                nums1[p--] = nums1[i--];
        }

        //If any element left in nums2
        //Same need not be checked for nums1 as if i>=0 alsonums1 is already sorted
        //so all the elements are in its correct positions.
        while (j >= 0)
            nums1[p--] = nums2[j--];
    }
}
