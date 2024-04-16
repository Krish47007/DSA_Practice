package arrays.intermediate.day_11_carry_forward.assignment;

public class Closest_MinMax {

    public int solve(int[] arr) {

        //first we have to find min and max of array
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : arr) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        //Edge case
        if (min == max)
            return 1;
        //In worst case the entire array length can be size of sub-array
        //containing both min and max ex - [1,2,3,4,5,6,7,8,9]
        int ans = arr.length;
        int minIndex = -1, maxIndex = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                minIndex = i;
                //At this point maxIndex is already calculated so it can't be < than i.
                if (maxIndex != -1)
                    ans = Math.min(ans, maxIndex - minIndex + 1);
            } else if (arr[i] == max) {
                maxIndex = i;
                //At this point minIndex is already calculated so it can't be < than i.
                if (minIndex != -1)
                    ans = Math.min(ans, minIndex - maxIndex + 1);
            }
        }

        return ans;
    }
}
