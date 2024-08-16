package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class MaxSubArraySum_OfLength_K_3 {

    public static int getMaxSubArraySum(int[] arr,int k)
    {
        int n = arr.length;
        int maxSum = 0;
        if(k > n)
            return maxSum;
        else if( k == n)
        {
            for (int x : arr)
                maxSum += x;

            return maxSum;
        }
        else
        {
            int s = 0;
            int sum = 0;
            //Starting window is k that is 0 to k-1.
           for (int i = 0;i<k;i++)
               sum += arr[i];

            maxSum = sum;

            for (int i = k; i < n;i++)
            {
                sum = sum - arr[s];
                sum = sum + arr[i];
                maxSum = Math.max(maxSum,sum);
                s++;

            }
            return maxSum;

        }

    }

    public static void main(String[] args) {

        int[] arr = { 3,-2,4,-1,2,6 };
        System.out.println(getMaxSubArraySum(arr,3));
    }
}
