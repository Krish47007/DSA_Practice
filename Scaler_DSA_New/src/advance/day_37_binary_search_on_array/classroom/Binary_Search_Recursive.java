package advance.day_37_binary_search_on_array.classroom;

public class Binary_Search_Recursive {

    private static int binSearch(int[] arr,int beg,int end,int target)
    {
        if( beg <= end)
        {
            int mid = beg + (end - beg)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                return binSearch(arr,beg,mid - 1,target);
            else
                return binSearch(arr,mid + 1,end,target);

        }
        return -1;
    }

    public static int binarySearch(int[] arr,int target)
    {
        return binSearch(arr,0,arr.length-1,target);
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,3,4,5},1));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},5));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},3));
        System.out.println(binarySearch(new int[]{1,2,3,4,5},9));
    }
}
