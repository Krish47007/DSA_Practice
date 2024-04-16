package arrays.intermediate.day_11_carry_forward.assignment;

import java.util.ArrayList;
import java.util.List;

public class Leaders_in_an_array {

    public int[] solve(int[] arr) {

        List<Integer> temp = new ArrayList<>();
        //Last element is always a leader
        int max = arr[arr.length - 1];
        temp.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                temp.add(arr[i]);
                max = arr[i];
            }
        }

        int[] ans = new int[temp.size()];
        int k = 0;
        for (int x : temp)
            ans[k++] = x;

        return ans;
    }
}
