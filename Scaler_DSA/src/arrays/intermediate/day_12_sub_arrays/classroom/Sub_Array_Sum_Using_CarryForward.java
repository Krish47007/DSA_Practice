package arrays.intermediate.day_12_sub_arrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class Sub_Array_Sum_Using_CarryForward {

    public static List<Integer> getEachSubArraySum(int[] arr)
    {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0;i<n;i++)
        {
            int sum = 0;
            for (int j = i; j < n;j++) {
                sum = sum + arr[j];
                ans.add(sum);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {6,8,-1,7};

        for (int x : getEachSubArraySum(arr))
            System.out.print(x + "\t");
    }
}
