package _1_arrays_1_and_hashing.classroom;

public class WiggleSort {

    private void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
        The intuition is to check if an even indexed element is <= its next odd neighbour
         and for odd index element >= its even index neighbour.
         If that's not the case we need to swap the adjacent elements.
         if nums[0] < nums[1] but nums[1] < nums[2] then we need to swap nums[1] and nums[2].
         Since nums[2] is already > nums[1] so even if we swap nums[2] and nums[1] the following holds
         nums[0] <= nums[1] >= nums[2].
     */
    public void wiggleSort(int[] nums) {

        int n = nums.length;

        for (int i = 0;i < n-1;i++)
        {
            if ((i & 1) == 0)
            {
                if(nums[i] > nums[i+1])
                    swap(nums,i,i+1);
            }
            else
            {
                if (nums[i] < nums[i+1])
                    swap(nums,i,i+1);
            }
        }
    }
}
