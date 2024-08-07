package intermediate.day_11_carry_forward_sub_arrays.additional;

import java.util.Map;

public class Best_Time_to_Buy_and_Sell_Stocks_I {

    private int[] buildSuffixGreater(int[] arr)
    {
        int n = arr.length;
        int[] pf = new int[n];
        pf[n - 1] = arr[n - 1];
        int max = arr[n-1];

        for (int i = n - 2;i>=0;i--)
        {
            pf[i] = max;
            max = Math.max(max,arr[i]);
        }
        return pf;
    }

    public int maxProfit(final int[] A) {

        int maxProfit = 0;
        if(A.length == 0)
            return maxProfit;
        int[] pf = buildSuffixGreater(A);
        for (int i = 0;i<A.length;i++)
        {
            maxProfit = Math.max(maxProfit,pf[i] - A[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        var obj = new Best_Time_to_Buy_and_Sell_Stocks_I();

        System.out.println(obj.maxProfit(new int[]{1, 4, 5, 2, 4}));
        System.out.println(obj.maxProfit(new int[]{1, 2}));
        System.out.println(obj.maxProfit(new int[]{4, 2}));
        System.out.println(obj.maxProfit(new int[]{4}));
    }
}
