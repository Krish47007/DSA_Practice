package advance.day_36_quick_sort_and_comparator.assignment;

public class Sort_By_Color_Using_DNF {

    /*
    *   We will use 3 pointers here low,mid and high.
    *   low - denotes the end of 0s in array from start.
    *   high - denotes the starting of 2s in array till end
    *   mid - denotes the staring of the unknown region, we dont what we have here like 0, 1 or 2.
    *
    *  Algo -
    *       if(A[mid] == 0)
    *           we swap A[low] and A[mid] and move both pointers forward.
    *       if(A[mid] == 2)
    *          we swap A[high] and A[mid] and increment mid by 1 and decrement high by 1.
    *       if(A[mid] == 1) simply increment mid by 1.
    * */
    public int[] sortColors(int[] A) {

        int low = 0,mid = 0, high = A.length - 1;

        while (mid <= high)
        {
            if(A[mid] == 0)
            {
                swap(A,low,mid);
                low++;
                mid++;
            }
            else if(A[mid] == 2)
            {
                swap(A,mid,high);
                high--;
            }
            else
                mid++;
        }
        return A;
    }

    private void swap(int[] A,int start,int end)
    {
        int temp = A[start];
        A[start] = A[end];
        A[end] = temp;
    }

    public static void main(String[] args) {

        var obj = new Sort_By_Color_Using_DNF();

        for (int x : obj.sortColors(new int[]{0, 1, 2, 0, 1, 2}))
        {
            System.out.print(x+" ");
        }
    }
}
