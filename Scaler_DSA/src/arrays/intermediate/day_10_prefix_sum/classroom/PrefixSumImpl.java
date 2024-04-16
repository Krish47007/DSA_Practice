package arrays.intermediate.day_10_prefix_sum.classroom;

public class PrefixSumImpl {

    int[] getPrefixSum(int[] arr) {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1; i < arr.length; i++)
            pf[i] = pf[i - 1] + arr[i];

        return pf;
    }

    public static void main(String[] args) {

        var obj = new PrefixSumImpl();
        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[] pf = obj.getPrefixSum(arr);

        System.out.println("Sum[8] : " + pf[8]);
        System.out.println("Sum[4,8] : " + (pf[8] - pf[3]));

    }
}
