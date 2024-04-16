package arrays.advanced.oneD;

public class MaxSubArraySum_2 {

    public int[] getSubArrayWithMaxSum(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Wrong input!!!!");

        int ans = arr[0], sum = 0;
        int start = 0, end = 0;
        int sMax = 0, eMax = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > ans) {
                ans = sum;
                sMax = start;
                end = i;
                eMax = end;
            }
            //if -ve reset the sum and don't propagate
            if (sum < 0) {
                sum = 0;
                start = i + 1;
                //end = i+1;
            }
        }
        return new int[]{sMax, eMax};
    }

    public static void main(String[] args) {

        var obj = new MaxSubArraySum_2();
        //int[] arr = new int[]{10,-5,7,8,-11,2,-20,10,-3,-10,15,8,-10};
        int[] arr = new int[]{-10, -2, -8, -5};
        //int[] arr = new int[]{1,2,3,4,5};
        //int[] arr = new int[]{5,1,-7,12,-4,8};
        for (int x : obj.getSubArrayWithMaxSum(arr))
            System.out.print(x + " ");
    }
}
