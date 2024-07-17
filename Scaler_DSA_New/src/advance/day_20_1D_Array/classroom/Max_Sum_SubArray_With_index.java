package advance.day_20_1D_Array.classroom;

public class Max_Sum_SubArray_With_index {

    public static int[] getSumWithIndices(int[] arr)
    {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int l = 0;
        int[] idx = new int[2];
        for (int i = 0;i< arr.length;i++)
        {
            sum += arr[i];

            if(ans < sum) {
                ans = sum;
                idx[0] = l;
                idx[1] = i;
            }

            if(sum < 0) {
                sum = 0;
                l = i + 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {

        int[] arr = {5,6,7,-3,2,-10,-12,8,12,-4,7,-2};

        for (int idx : getSumWithIndices(arr))
            System.out.print(idx + " ");
    }
}
