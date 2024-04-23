package arrays.intermediate.day_12_sub_arrays.additional;

public class Good_Subarrays_Easy {

    public int solve(int[] arr, int b) {

        int goodSubArrayCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                int length = j - i + 1;
                if (length % 2 == 0 && sum < b)
                    goodSubArrayCount++;
                else if (length % 2 != 0 && sum > b)
                    goodSubArrayCount++;
            }
        }
        return goodSubArrayCount;

    }
}
