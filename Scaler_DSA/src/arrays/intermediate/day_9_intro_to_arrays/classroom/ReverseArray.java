package arrays.intermediate.day_9_intro_to_arrays.classroom;

public class ReverseArray {

    /*
    * Given an array, reverse the entire array
    */

    public static int[] reverseArray(int[] arr)
    {
        int beg = 0,end = arr.length - 1;

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

        int[] arr = { 1,2,3,4};

        for (int x : reverseArray(arr))
            System.out.print(x+ " ");
    }
}
