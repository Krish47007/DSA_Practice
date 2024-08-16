package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class MaxSubArraySum_OfLength_K_2 {
    /*
     *  For all sub arrays of length K and take max sum from prefixSum
     * */

    private static int[] buildPFSum(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1;i<arr.length;i++)
            pf[i] = pf[i-1] + arr[i];

        return pf;
    }
    public static int maxSumSubArray(int[] arr,int k)
    {
        int n = arr.length;
        int maxSum = 0;
        if( k > n)
            return maxSum;
        // start index of last sub array of length is [ n-k, n-1 ]

        int[] pf = buildPFSum(arr);
        for (int i = 0; i <= (n-k);i++)
        {
            int l = i;
            int r = l + (k-1);

            if(l == 0)
                maxSum = Math.max(maxSum, pf[r]);
            else
                maxSum = Math.max(maxSum,pf[r] - pf[l-1]);

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { 3,-2,4,-1,2,6 };
        System.out.println(maxSumSubArray(arr,3));
    }

}
