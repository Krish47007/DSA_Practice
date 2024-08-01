package arrays;

public class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = nums1.length - 1;
        int p = m - 1, q = n - 1;

        while (p >= 0 && q >= 0)
        {
            if(nums1[p] >= nums2[q])
            {
                nums1[k] = nums1[p];
                p--;
            }
            else {
                nums1[k] = nums2[q];
                q--;
            }
            k--;
        }

        //check for remaining elements
        while (p >= 0)
        {
            nums1[k--] = nums1[p--];
        }
        while (q >= 0)
        {
            nums1[k--] = nums2[q--];
        }
    }
}
