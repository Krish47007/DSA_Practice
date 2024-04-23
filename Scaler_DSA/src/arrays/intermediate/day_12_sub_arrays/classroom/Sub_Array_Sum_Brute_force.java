package arrays.intermediate.day_12_sub_arrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class Sub_Array_Sum_Brute_force {

    //Brute-Force solution - iterate through each sub array and sum them
    public static List<Integer> getEachSubArraySum(int[] arr)
    {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0;i< arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                int sum = 0;
                for (int k = i;k<=j;k++)
                    sum += arr[k];

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
