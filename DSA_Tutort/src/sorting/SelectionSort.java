package sorting;

public class SelectionSort {

    /*
    *  In selection sort we sort pos wise.
    * We are finding the minimum element in the remaining part of the array.
    * We put the 1st minimum element in 1st pos, 2nd min in 2nd pos and so on.
    * */
    static void selectionSort(int[] arr)
    {
        //If we sort till n-1th pos then last pos is already sorted
        for(int i = 0;i< arr.length-1;i++)
        {
            //int min = arr[i];
            int minIndex = i;

            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[j] < arr[minIndex])
                {
                   minIndex = j;
                }
            }

            //swap
            int t = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = t;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5,1,1,2,2,0,0};

        selectionSort(arr);

        for (int x: arr)
            System.out.print(x+" ");
    }

}
