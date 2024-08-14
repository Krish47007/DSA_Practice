package advance.day_37_binary_search_on_array.assignment;

public class Sorted_Insert_Position {

     public int searchInsert(int[] A, int B) {

         int beg = 0,end = A.length - 1;
         int ans = -1;

         while (beg <= end)
         {
             int mid = beg + (end - beg)/2;
             if(A[mid] == B) {
                 ans = mid;
                 break;
             }
             else if(A[mid] > B)
             {
                 //Store the index of closest max value > B
                 ans = mid;
                 end = mid - 1;
             }
             else
                 beg = mid + 1;
         }

         return ans != -1 ? ans : A.length;

    }

    public static void main(String[] args) {

        var obj = new Sorted_Insert_Position();
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6},3));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 6},4));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 8},6));
        System.out.println(obj.searchInsert(new int[]{1, 3, 5, 8},9));
    }
}
