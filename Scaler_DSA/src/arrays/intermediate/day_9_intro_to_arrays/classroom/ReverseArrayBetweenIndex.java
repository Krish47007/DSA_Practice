package arrays.intermediate.day_9_intro_to_arrays.classroom;

public class ReverseArrayBetweenIndex {

    /*
     * Given an array and two indices [s,e], reverse the array between s and e
     */

    public static int[] revArrayBWIndices(int[] arr,int s,int e)
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

        int[] arr = { 1,4,-2,5,-7,4,-1,-5,9,2};
        for (int x : revArrayBWIndices(arr,3,5))
            System.out.print(x+ " ");
    }


}
