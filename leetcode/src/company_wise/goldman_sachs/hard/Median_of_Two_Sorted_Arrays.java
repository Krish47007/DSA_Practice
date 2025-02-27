package company_wise.goldman_sachs.hard;

public class Median_of_Two_Sorted_Arrays {

    //Solution 1 - using merged Arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] ans = merge(nums1,nums2);
        int n = ans.length;
        if (n % 2 != 0)
            return ans[n/2];
        else
            return (ans[n/2] + (double)ans[(n/2) - 1] ) / 2;
    }

    private static int[] merge(int[] A,int[] B)
    {
        int m = A.length, n = B.length;
        int i = 0, j = 0, k = 0;
        int[] ans = new int[m + n];

        while (i < m && j< n)
        {
            if (A[i] <= B[j])
            {
                ans[k++] = A[i++];
            }
            else
                ans[k++] = B[j++];
        }

        while (i < m)
            ans[k++] = A[i++];

        while ( j < n)
            ans[k++] = B[j++];

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

}
