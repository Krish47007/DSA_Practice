package company_wise.goldman_sachs.medium;

import java.util.Arrays;

public class Construct_Smallest_Number_From_DI_String {

    private static void reverse(int[] arr,int beg,int end)
    {
        while (beg < end)
        {
            int temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
    }
    public static String smallestNumber(String pattern) {

        int[] ans = new int[ pattern.length() + 1];

        //Fill the array from 1 to n as this is the lexicographically smallest number
        for (int i = 0;i< ans.length;i++)
            ans[i] = i+1;

        for (int i = 0; i < pattern.length(); i++)
        {
            int temp = i;

            while (temp < pattern.length() && pattern.charAt(temp) == 'D')
                temp++;

            // temp - 1 as at temp its either the string has ended or its not equal to 'D'
            reverse(ans,i,temp);

            if (temp != i)
                i = temp - 1;
        }

        return Arrays.toString(ans).replaceAll("\\[|]|,\\s","");

    }

    public static void main(String[] args) {

        System.out.println(smallestNumber("DIDIDD"));
    }
}
