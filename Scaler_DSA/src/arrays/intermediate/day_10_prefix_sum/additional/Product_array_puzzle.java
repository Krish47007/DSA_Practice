package arrays.intermediate.day_10_prefix_sum.additional;

public class Product_array_puzzle {

    public int[] solve(int[] arr) {

        int[] pf = new int[arr.length];
        int[] sf = new int[arr.length];

        //Constructing prefix and suffix product array
        pf[0] = sf[arr.length - 1] = 1;

        for (int i = 1; i < arr.length; i++)
            pf[i] = pf[i - 1] * arr[i - 1];

        for (int i = arr.length - 2; i >= 0; i--)
            sf[i] = sf[i + 1] * arr[i + 1];

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            ans[i] = pf[i] * sf[i];

        return ans;
    }
}
