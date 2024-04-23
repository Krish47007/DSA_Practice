package arrays.intermediate.day_12_sub_arrays.assignment;

public class Maximum_Subarray_Easy {

    /*public int maxSubarray(int a, int b, int[] c) {

        boolean isSumPossible = false;
        int maxSum = 0;
        for (int x : c) {
            if (x <= b) {
                isSumPossible = true;
            }
        }
        if (!isSumPossible)
            return maxSum;

        for (int i = 0; i < c.length; i++) {
            int sum = 0;
            for (int j = i; j < c.length; j++) {
                sum += c[j];
                if (sum <= b)
                    maxSum = Math.max(maxSum, sum);
                else
                    break;
            }
        }

        return maxSum;
    }*/

    public static int maxSubarray(int A, int B, int[] C) {

        int maxSum = 0; //as per question -ve values are not there in array
        for (int i = 0;i<A;i++)
        {
            int sum = 0;
            for (int j = i;j<A;j++)
            {
                sum += C[j];
                if(sum <= B)
                    maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
