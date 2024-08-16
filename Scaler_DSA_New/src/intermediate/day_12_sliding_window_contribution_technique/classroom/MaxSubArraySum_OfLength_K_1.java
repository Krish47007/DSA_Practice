package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class MaxSubArraySum_OfLength_K_1 {

    /*
    *  Find all sub arrays of length K and take max sum.
    * */
    public static int maxSumSubArray(int[] arr,int k)
    {
        int n = arr.length;
        int maxSum = 0;
        if( k > n)
            return maxSum;
        // start index of last sub array of length is [ n-k, n-1 ]
        for (int i = 0; i <= (n-k);i++)
        {
            int l = i;
            int r = l + (k-1);
            int sum = 0;
            for (int j = l; j <= r; j++)
            {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);

        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { 3,-2,4,-1,2,6 };
        System.out.println(maxSumSubArray(arr,3));
    }

}
