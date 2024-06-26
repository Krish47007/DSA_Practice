package arrays;


public class Rotate_Array {

    static void reverse(int[] nums, int beg, int end) {
        while (beg < end) {
            int t = nums[beg];
            nums[beg] = nums[end];
            nums[end] = t;
            beg++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        //If k is greater than n
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);


    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        for (int x : nums)
            System.out.print(x + " ");

    }
}
