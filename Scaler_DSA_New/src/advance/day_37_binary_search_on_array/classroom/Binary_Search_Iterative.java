package advance.day_37_binary_search_on_array.classroom;

public class Binary_Search_Iterative {

    public static int binarySearch(int[] arr,int target)
    {
        int beg = 0, end = arr.length - 1;

        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,3,4,5},1));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},5));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},3));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},9));
    }
}
