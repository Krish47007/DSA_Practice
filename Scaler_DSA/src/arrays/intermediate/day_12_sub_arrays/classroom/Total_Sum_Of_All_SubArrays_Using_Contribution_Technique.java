package arrays.intermediate.day_12_sub_arrays.classroom;

public class Total_Sum_Of_All_SubArrays_Using_Contribution_Technique {

    public static int getSumOfAllSubArrays(int[] arr)
    {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++)
        {
            //freq of a[i] in all sub arrays
            int freq = (i+1) * (n-i);
            totalSum += (arr[i] * freq);

        }
        return totalSum;
    }

    public static void main(String[] args) {

        int[] arr = { 4,3,7};
        System.out.println(getSumOfAllSubArrays(arr));
    }
}
