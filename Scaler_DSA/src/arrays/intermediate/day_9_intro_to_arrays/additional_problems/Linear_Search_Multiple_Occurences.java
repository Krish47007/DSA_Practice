package arrays.intermediate.day_9_intro_to_arrays.additional_problems;

public class Linear_Search_Multiple_Occurences {

    public int solve(int[] arr, int x) {

        int freq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                freq++;
        }
        return freq;
    }
}
