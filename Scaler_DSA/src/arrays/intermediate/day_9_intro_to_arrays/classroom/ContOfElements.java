package arrays.intermediate.day_9_intro_to_arrays.classroom;

public class ContOfElements {

    /*
    *   Given an array return the count of elements having at least one element greater than itself.
    *   arr[] = { 2,5,1,4,8,0,,8,1,3,8}
    *   ans = 7
    */

    public static int countElements(int[] arr)
    {
        /*
        * We know that max element in the array can't have any element greater than itself in the array.
        * So for remaining elements we know there's at least one element greater than themselves ( The max element)
        * So we need to count the frequency of max elements say M.
        * So ans = N - M where N is the size of the array and M is freq of max element in the array.*/

        int max = arr[0];int maxCount = 1;

        for (int i = 1;i<arr.length;i++)
        {
            if(max == arr[i])
                maxCount++;
            else if(max < arr[i])
            {
                max = arr[i];
                maxCount = 1;
            }
        }

        return arr.length - maxCount;
    }

    public static void main(String[] args) {

        System.out.println(countElements(new int[]{ 2,5,1,4,8,0,8,1,3,8}));
        System.out.println(countElements(new int[]{ 8,8,8,8}));
        System.out.println(countElements(new int[]{ 1,2,3,4,5}));
        System.out.println(countElements(new int[]{ 5,4,3,2,1}));
    }
}
