package arrays.advanced.oneD;

public class SubArraySumStartingFromIndexZero {

    public int getSubArraySum(int[] arr) {
        int sum = 0, maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        var obj = new SubArraySumStartingFromIndexZero();
        System.out.println(obj.getSubArraySum(new int[]{10, -5, 7, 8, -1, 2}));
    }
}
