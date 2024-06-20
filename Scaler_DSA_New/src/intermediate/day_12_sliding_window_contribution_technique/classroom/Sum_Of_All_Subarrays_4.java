package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class Sum_Of_All_Subarrays_4 {

    /*
    *  we have to find the no. of sub arrays in which A[i] is part of.
    *   so contribution of A[i] is A[i] * freq of A[i].
    */

    public static int sumOfAllSubArrays(int[] arr)
    {
        int sum = 0;
        int n = arr.length;
        for (int i = 0;i<n;i++)
        {
            sum += arr[i] * (i+1) * (n-i);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfAllSubArrays(new int[]{3,2,5}));
    }
}
