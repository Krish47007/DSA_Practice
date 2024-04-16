package arrays.intermediate.day_12_sub_arrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class Sub_Array_Sum {

    //Brute-Force solution - iterate through each sub array and sum them
    public static List<Integer> getEachSubArraySum(int[] arr)
    {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0;i< arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                int sum = 0;
                for (int k = i;k<=j;k++)
                    sum += arr[k];

                ans.add(sum);
            }
        }

        return ans;
    }

    //Better approach using prefix sum
    private static int[] getPrefixSum(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1;i<arr.length;i++)
            pf[i] = pf[i-1] + arr[i];

        return pf;
    }

    public static List<Integer> getEachSubArraySum_2(int[] arr)
    {
        List<Integer> ans = new ArrayList<>();
        int[] pf = getPrefixSum(arr);

        for (int i = 0;i< arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                int sum = ( i == 0 ) ? pf[j] : (pf[j] - pf[i-1]);

                ans.add(sum);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {6,8,-1,7};

        for (int x : getEachSubArraySum_2(arr))
            System.out.print(x + "\t");
    }
}
