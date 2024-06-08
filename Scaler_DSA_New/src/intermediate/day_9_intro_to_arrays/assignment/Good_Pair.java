package intermediate.day_9_intro_to_arrays.assignment;

import java.util.Arrays;

public class Good_Pair {

    int binarySearch(int[] arr,int key,int currIdx)
    {
        int beg = 0,end = arr.length-1;

        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;
            if(arr[mid] == key && mid != currIdx)
                return mid;
            else if(arr[mid] > key)
                end = mid-1;
            else
                beg = mid + 1;
        }
        return -1;
    }
    public int solve(int[] A, int B) {

        Arrays.sort(A);
        for (int i = 0;i<A.length;i++)
        {
            if (binarySearch(A,B-A[i],i) != -1)
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        var gp = new Good_Pair();
       /* System.out.println(gp.solve(new int[]{1,2,3,4},7));
        System.out.println(gp.solve(new int[]{1,2,2},4));
        System.out.println(gp.solve(new int[]{1,2,4},4));*/
        System.out.println(gp.solve(new int[]{510827,351151,96897,925335,299818,192489,456948,44720,510589,598577},808099));
        //808099 + 456948
    }
}
