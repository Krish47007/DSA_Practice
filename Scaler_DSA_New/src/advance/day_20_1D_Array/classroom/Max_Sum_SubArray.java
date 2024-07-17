package advance.day_20_1D_Array.classroom;

public class Max_Sum_SubArray {

    public static int getSum(int[] arr)
    {
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0;i< arr.length;i++)
        {
            sum += arr[i];

            if(ans < sum)
                ans = sum;

            if(sum < 0)
                sum = 0;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5,6,7,-3,2,-10,-12,8,12,-4,7,-2};
        System.out.println(getSum(arr));
    }
}
