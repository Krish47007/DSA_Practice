package arrays;

public class Two_Sum_II {

    public static int[] twoSum(int[] nums, int target) {

        int beg = 0,end = nums.length - 1;
        int[] res = new int[2];
        while (beg < end)
        {
            int sum = nums[beg] + nums[end];

            if(sum == target)
            {
                res[0] = beg + 1;
                res[1] = end + 1;
                return res;
            }
            else if(sum > target)
            {
                end--;
            }
            else
                beg++;

        }

        return res;

    }

    public static void main(String[] args) {

        for(int x : twoSum(new int[]{2,7,11,15},9))
            System.out.println(x+" ");

    }
}
