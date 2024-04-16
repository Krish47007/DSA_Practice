package arrays.intermediate.day_9_intro_to_arrays.classroom;

public class RotataArrayClockwise {

    /*
    * Given an array rotate it from end (clockwise) k times.
    * arr[7] = 3, -2, 1, 4, 6, 9, 8 , k = 3
    * k = 1  : 8,  3, -2, 1, 4, 6, 9
    * k = 2  : 9,  8, 3, -2, 1, 4, 6
    * k = 3  : 6,  9, 8,  3, -2, 1, 4
    *
    * Idea is to reverse the whole array first
    * then reverse array from 0 to k-1 and then reverse from k to n-1.
    * */

    public static int[] rotateClockwiseKtimes(int[] arr,int k)
    {
        int n = arr.length;
        k = k % n;
        if(k == 0)
            return arr;
        revArrayBWIndices(arr,0,n-1);
        revArrayBWIndices(arr,0,k-1);
        revArrayBWIndices(arr,k,n-1);
        return arr;
    }

    private static int[] revArrayBWIndices(int[] arr,int s,int e)
    {
        if(s >= e)
            return arr;
        return reverse(arr,s,e);
    }

    private static int[] reverse(int[] arr, int s, int e) {
        int beg = s,end = e;

        while (beg < end)
        {
            swap(arr,beg,end);
            beg++;
            end--;
        }

        return arr;
    }
    private static void swap(int[] arr,int beg,int end)
    {
        int temp = arr[beg];
        arr[beg] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int[] arr = rotateClockwiseKtimes(new int[]{3, -2, 1, 4, 6, 9, 8},10);

        for (int x : arr)
            System.out.print(x + " ");
    }

}
