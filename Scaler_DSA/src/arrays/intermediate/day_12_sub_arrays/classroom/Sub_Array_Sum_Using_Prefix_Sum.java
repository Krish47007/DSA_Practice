package arrays.intermediate.day_12_sub_arrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class Sub_Array_Sum_Using_Prefix_Sum {

    private static int[] getPrefixSum(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1;i<arr.length;i++)
            pf[i] = pf[i-1] + arr[i];

        return pf;
    }

    public static List<Integer> getEachSubArraySum(int[] arr)
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

        for (int x : getEachSubArraySum(arr))
            System.out.print(x + "\t");
    }

}
