package arrays.advanced.oneD;

/*
 *   Given an array find the max sub array sum.
 * */
public class MaximumSubArraySum {

    public int getSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int ans = arr[0], sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            //if -ve reset the sum and don't propagate
            if (sum < 0)
                sum = 0;
        }
        return ans;
    }

    public static void main(String[] args) {

        var obj = new MaximumSubArraySum();
        System.out.println(obj.getSubArraySum(new int[]{10, -5, 7, 8, -11, 2, -20, 10, -3, -10, 15, 8, -10}));
    }
}
