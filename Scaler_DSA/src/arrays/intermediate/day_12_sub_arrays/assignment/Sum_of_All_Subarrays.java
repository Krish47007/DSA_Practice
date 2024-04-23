package arrays.intermediate.day_12_sub_arrays.assignment;

public class Sum_of_All_Subarrays {


    public long subarraySum(int[] A) {

        long totalSum = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            //freq of A[i] in the final result

            totalSum += (long) A[i] * (i + 1) * (n - i);
        }

        return totalSum;
    }
}
