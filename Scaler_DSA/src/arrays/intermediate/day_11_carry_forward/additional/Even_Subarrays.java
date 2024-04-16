package arrays.intermediate.day_11_carry_forward.additional;

public class Even_Subarrays {

    private boolean isOdd(int n)
    {
        return n % 2 != 0;
    }

    public String solve(int[] arr) {

        /*
        * If the size of array is odd then it can't be broken into even no. of sub-arrays.
        * If boundary elements are not even then its not possible to break the array into even number of
        * sub arrays where each sub array contains even number as boundary elements ( even no of sub array possible but boundary even elements
        * for those sub array is not possible)
        *
        * E.g - [2,3,5,7] or [7,3,5,2] : in both cases even num of sub-array possible
        * The above conditions satisfy the case where all elements are even and all are odds.
        */

        int n = arr.length;

        if (isOdd(n) || isOdd(arr[0]) || isOdd(arr[n-1]))
            return "NO";

        return "YES";
    }
}
