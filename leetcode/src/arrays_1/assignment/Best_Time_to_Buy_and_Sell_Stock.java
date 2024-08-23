package arrays_1.assignment;

public class Best_Time_to_Buy_and_Sell_Stock {

    private int[] buildSuffixLargest(int[] A)
    {
        int n = A.length;
        int[] sf = new int[n];
        sf[n-1] = A[n-1];
        int max = sf[n-1];

        for (int i = n-2;i>=0;i--)
        {
            sf[i] = max;
            max = Math.max(max,A[i]);
        }
        return sf;
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int[] sf = buildSuffixLargest(prices);
        for (int i = 0;i<prices.length;i++)
        {
            maxProfit = Math.max(maxProfit,sf[i] - prices[i]);
        }
        return maxProfit;

    }

    public static void main(String[] args) {

        var obj = new Best_Time_to_Buy_and_Sell_Stock();

        System.out.println(obj.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(obj.maxProfit(new int[]{7,6,4,3,1}));
    }
}
