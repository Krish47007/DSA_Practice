package searching;

public class BinarySearch {

    static int binarySearch(int[] arr,int key)
    {
        int beg = 0,end = arr.length - 1;

        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;

            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                end = mid - 1;
            else
                beg = mid + 1;
        }

        return -1;
    }

    /*
    *  beg = 0 , 3, 4
    *  end = 4
    *  mid = 4
    * */

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5};

        System.out.println(binarySearch(arr,5));
    }
}
