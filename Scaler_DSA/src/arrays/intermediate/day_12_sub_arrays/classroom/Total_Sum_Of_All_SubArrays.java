package arrays.intermediate.day_12_sub_arrays.classroom;

public class Total_Sum_Of_All_SubArrays {

    public static int getSumOfAllSubArrays(int[] arr)
    {
        int n = arr.length;
        int totalSum = 0;

        //We can't use only a single variable as
        // single elements as sub arrays will be missed.
         for (int i = 0; i < n; i++)
         {
             int sum = 0;
             for (int j = i;j<n;j++) {
                 sum += arr[j];
                 totalSum += sum;
             }

         }
         return totalSum;
    }

    public static void main(String[] args) {

        int[] arr = { 4,3,7};
        System.out.println(getSumOfAllSubArrays(arr));
    }
}
