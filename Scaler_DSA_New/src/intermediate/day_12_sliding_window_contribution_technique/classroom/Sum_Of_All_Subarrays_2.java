package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class Sum_Of_All_Subarrays_2 {

    /*
     * Using prefix sum
     *  TC - O(n^2), SC = O(N)
     */

    private static int[] buildPrefixSum(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1;i<arr.length;i++)
            pf[i] = pf[i-1] + arr[i];
        return pf;

    }
    public static int sumOfAllSubArrays(int[] arr)
    {
        int totalSum = 0;
        int n = arr.length;
        int[] pf = buildPrefixSum(arr);

        for (int i = 0;i < n;i++)
        {
            for (int j = i;j<n;j++)
            {
                if(i == 0)
                    totalSum += pf[j];
                else
                    totalSum += (pf[j] - pf[i-1]);
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfAllSubArrays(new int[]{3,2,5}));
    }

}
