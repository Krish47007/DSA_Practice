package intermediate.day_12_sliding_window_contribution_technique.assignment;

public class Maximum_Subarray_Easy {

    public static int maxSubarray(int A, int B, int[] C) {

        int maxSum = 0;

        for (int i = 0;i<A;i++)
        {
            int sum = 0;
            for (int j = i;j<A;j++)
            {
                sum = sum + C[j];
                if(sum <= B)
                    maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        System.out.println(maxSubarray(5,12,new int[]{2, 1, 3, 4, 5}));
        System.out.println(maxSubarray(3,1,new int[]{2, 2, 2}));
    }
}
