package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class Sum_Of_All_Subarrays_3 {


    /*
     * Using carry forward
     *  TC - O(n^2), SC = O(1)
     */

    public static int sumOfAllSubArrays(int[] arr)
    {
        int totalSum = 0;
        int n = arr.length;

        for (int i = 0;i < n;i++)
        {
            int sum = 0;
            for (int j = i;j<n;j++)
            {
                sum += arr[j];
                totalSum += sum;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfAllSubArrays(new int[]{3,2,5}));
    }
}
