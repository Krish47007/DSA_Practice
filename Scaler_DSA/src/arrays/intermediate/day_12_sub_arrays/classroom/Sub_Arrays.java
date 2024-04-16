package arrays.intermediate.day_12_sub_arrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class Sub_Arrays {

    public static List<List<Integer>> getAllSubArrays(int[] arr)
    {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0;i< arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                List<Integer> temp = new ArrayList<>();
                for (int k = i;k<=j;k++)
                    temp.add(arr[k]);

                ans.add(temp);
            }
        }

        return ans;
    }

    public static void printSubArrays(int[] arr)
    {
        List<List<Integer>> list = getAllSubArrays(arr);
        System.out.println("No. of sub-arrays : "+list.size());
        System.out.println(list);

    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        printSubArrays(arr);
        System.out.println();

        int n = arr.length;
        System.out.println("No. of sub arrays with array size "+n+" is : "+(n*(n+1)/2));
    }

}
