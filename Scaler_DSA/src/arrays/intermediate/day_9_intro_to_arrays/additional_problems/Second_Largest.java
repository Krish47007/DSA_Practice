package arrays.intermediate.day_9_intro_to_arrays.additional_problems;

public class Second_Largest {

    public static int solve(int[] arr) {

        int max1 = -1,max2 = -1;

        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] < max1)
                max2 = arr[i];
        }
        return max2;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{20, 12, 15, 19, 13, 5, 13, 12, 18}));
    }
}
