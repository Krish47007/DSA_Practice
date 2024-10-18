package advance.day_52_two_pointers.assignment;

import java.util.*;

public class Unique_Pairs_with_Given_Difference {

    /*
        This counts all distinct pairs where a[i] - a[j] == k
     */
    public static int solve(int[] A, int k) {

        int n = A.length;
        if( n <= 1 )
            return 0;

        //Sort the array
        Arrays.sort(A);
        int i = 0, j = 1;
        int ans = 0;

        while ( j < n)
        {
            //same index element should not be considered as its not a pair
            if ( i == j)
            {
                j++;
                continue;
            }

            int x = A[i];
            int y = A[j];

            if(y - x == k)
            {
                //take the 1st unique pair
                ans++;
                //skip duplicates

                while (i < n && A[i] == x)
                    i++;
                while (j < n && A[j] == y)
                    j++;
            }
            else if(y - x < k)
                j++;
            else
                i++;
        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{1,5,3,4,2},3));

        System.out.println(solve(new int[]{8, 12, 16, 4, 0, 20},4));

        System.out.println(solve(new int[]{1,1,1,2,2},0));
    }
}
