package company_wise.goldman_sachs.medium;

import java.util.Arrays;

public class Maximum_Subarray {

    private static int[] maxSumSubArray(int[] arr)
    {
        int maxSum = 0;
        int sumSoFar = 0;
        int si = 0, ei = 0;
        int[] idx = new int[2];
        for (int i = 0;i<arr.length;i++)
        {
            sumSoFar += arr[i];
            if (sumSoFar > maxSum)
            {
                ei = i;
                maxSum = sumSoFar;
                idx[0] = si;
                idx[1] = ei;
            }

            if (sumSoFar < 0) {
                sumSoFar = 0;
                si = ei = i + 1;
            }
        }

        return Arrays.copyOfRange(arr,idx[0],idx[1] + 1);
        /*for (int x : Arrays.copyOfRange(arr,idx[0],idx[1] + 1))
            System.out.print(x + " ");

        System.out.println();
        return maxSum;*/
    }

    public int maxSubArray(int[] nums) {

        int sumSoFar = 0, maxSum = nums[0];

        for (int x : nums)
        {
            sumSoFar = sumSoFar + x;

            maxSum = Math.max(sumSoFar,maxSum);

            //Reset sum if -ve as it will reduce the over all sum
            if (sumSoFar < 0)
                sumSoFar = 0;
        }

        return maxSum;
    }
}
