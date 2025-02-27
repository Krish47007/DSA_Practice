package _1_arrays_1_and_hashing.assignment;

public class Best_Time_to_Buy_and_Sell_Stock_II {

        public static int maxProfit(int[] prices) {

           int profit = 0;
           if (prices == null || prices.length <= 1)
               return profit;

            for (int i = 1; i < prices.length; i++) {

                // Local minima: when prices[i] > prices[i - 1], it's a potential increase
                if (prices[i] > prices[i-1])
                {
                    // Accumulate profit as if we "buy" at prices[i - 1] and "sell" at prices[i]
                    profit += prices[i] - prices[i-1];
                }
            }
            return profit;
        }

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }
}
