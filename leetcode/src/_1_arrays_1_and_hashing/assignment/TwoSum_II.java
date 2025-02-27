package _1_arrays_1_and_hashing.assignment;

public class TwoSum_II {

    public static int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];

        int beg = 0, end = numbers.length - 1;

        while (beg < end)
        {
            int sum = numbers[beg] + numbers[end];
            if(sum == target)
            {
                ans[0] = beg + 1;
                ans[1] = end + 1;
                break;
            }
            else if(sum > target)
                end--;
            else
                beg++;
        }
        return ans;
    }

    public static void main(String[] args) {

        for (int x : twoSum(new int[]{2,7,11,15},9))
            System.out.print(x+" ");
    }
}
