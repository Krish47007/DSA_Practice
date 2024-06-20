package intermediate.day_12_sliding_window_contribution_technique.assignment;

public class Sum_of_All_Subarrays {

    public long subarraySum(int[] arr) {

        long sum = 0;
        int n = arr.length;
        for (int i = 0;i<n;i++)
        {
            long freq = (long) (i + 1) * (n-i);
            sum += (arr[i] * freq );
        }
        return sum;
    }
}
