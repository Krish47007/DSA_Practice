package company_wise.goldman_sachs.easy;

public class Third_Maximum_Number {

    public static int thirdMax(int[] nums) {

        long[] ans = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};

        for (int i = 0;i<nums.length;i++)
        {
            if(nums[i] > ans[0])
            {
                long t1 = ans[0];
                ans[0] = nums[i];
                if (t1 > ans[1])
                {
                    long t2 = ans[1];
                    ans[1] = t1;
                    if (t2 > ans[2])
                        ans[2] = t2;
                }
            }
            else if (nums[i] != ans[0] && nums[i] > ans[1])
            {
                long t1 = ans[1];
                ans[1] = nums[i];

                if (t1 > ans[2])
                    ans[2] = t1;
            }
            else if (nums[i] != ans[0] && nums[i] != ans[1] && nums[i] > ans[2])
                ans[2] = nums[i];
        }

        return ans[2] != Long.MIN_VALUE ? (int)ans[2] : (int)ans[0];

    }

    public static void main(String[] args) {

        System.out.println(thirdMax(new int[]{1,2,5,4,3}));
        System.out.println(thirdMax(new int[]{1,2,1,3,3}));
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{2,2,3,1}));
        System.out.println(thirdMax(new int[]{3,2,1}));
    }
}
