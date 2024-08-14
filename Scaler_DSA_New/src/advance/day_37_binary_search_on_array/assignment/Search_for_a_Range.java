package advance.day_37_binary_search_on_array.assignment;

public class Search_for_a_Range {

    private static int leftMostOccurrence(int[] arr,int target)
    {
        int beg = 0, end = arr.length - 1;
        int ans = -1;
        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;

            if(arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] > target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return ans;
    }

    private static int rightMostOccurrence(int[] arr,int target)
    {
        int beg = 0, end = arr.length - 1;
        int ans = -1;
        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;

            if(arr[mid] == target) {
                ans = mid;
                beg = mid + 1;
            }
            else if(arr[mid] > target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        return ans;
    }

    public static int[] searchRange(final int[] A, int B) {

        int leftPos = -1,rightPos = -1;
        leftPos = leftMostOccurrence(A,B);
        if(leftPos != -1)
            rightPos = rightMostOccurrence(A,B);

        return new int[]{leftPos,rightPos};
    }

    public static void main(String[] args) {

        int[] A = { 1,2,3,3,3,3,4,5};
        for (int x : searchRange(A,9))
            System.out.print(x + " ");
    }
}
