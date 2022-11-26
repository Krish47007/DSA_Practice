package arrays;

public class Wiggle_Sort {

    private static void swap(int[] a,int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void wiggleSort(int[] nums) {

        for(int i = 0;i< nums.length-1;i++)
        {
            if (i %2 == 0 && nums[i] > nums[i+1])
                swap(nums,i,i+1);
            else if(i %2 != 0 && nums[i] < nums[i+1])
                swap(nums,i,i+1);

        }
    }

    public static void main(String[] args) {

        int[] arr = {3,5,2,1,6,4};
        wiggleSort(arr);
        for(int x : arr)
            System.out.print(x+" ");
    }
}
