package arrays.intermediate;

public class Counting_Subarrays_Easy {

    public int solve(int[] arr, int b) {

        int count = 0;
        boolean isSumPossible = false;

        for (int x : arr) {
            if (x < b) {
                isSumPossible = true;
                break;
            }
        }
        //if there's no element less than b then sub array sum < b not possible
        if (!isSumPossible)
            return count;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= b)
                    break;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        var obj = new Counting_Subarrays_Easy();
        System.out.println(obj.solve(new int[]{3, 12, 11, 11, 11, 15}, 12));
    }
}
