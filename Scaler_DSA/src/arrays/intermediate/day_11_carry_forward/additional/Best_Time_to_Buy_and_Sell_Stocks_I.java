package arrays.intermediate.day_11_carry_forward.additional;

public class Best_Time_to_Buy_and_Sell_Stocks_I {

    public int maxProfit(final int[] arr) {

        int profit = 0;
        int n = arr.length;

        if(n != 0)
        {
            int max = arr[n-1];
            for (int i = n-2;i>=0;i--)
            {
                if(arr[i] < max)
                    profit = Math.max(profit, max - arr[i] );
                else if(arr[i] > max)
                    max = arr[i];
            }
        }

        return profit;

    }
}
