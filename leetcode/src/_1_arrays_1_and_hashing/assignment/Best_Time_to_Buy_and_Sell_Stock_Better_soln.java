package _1_arrays_1_and_hashing.assignment;

public class Best_Time_to_Buy_and_Sell_Stock_Better_soln {


    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1;i<prices.length;i++)
        {
            if(prices[i] < buy)
            {
                //can place a buy order
                buy = prices[i];
            }
            else {
                //Attempt to sell
                maxProfit = Math.max(maxProfit,prices[i] - buy);
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        var obj = new Best_Time_to_Buy_and_Sell_Stock_Better_soln();

        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(obj.maxProfit(new int[]{7,6,4,3,1}));
    }
}
