package advance.day_52_two_pointers.classroom;

import java.util.HashMap;
import java.util.Map;

public class Count_Pairs_Of_2Sum {

    public static int countPairs(int[] arr,int k)
    {
        long count = 0; int n = arr.length;
        int i = 0, j = n-1;
        int mod = 1000000007;
        while (i < j)
        {
            if(arr[i] + arr[j] == k)
            {
                int x = arr[i];
                int count_i = 0;
                // Count A[i] occurrences
                while (i < j && arr[i] == x)
                {
                    count_i = (count_i % mod + 1 % mod) % mod;
                    i++;
                }

                int y = arr[j];
                int count_j = 0;
                // Count A[j] occurrences
                while ( j >= i && arr[j] == y)
                {
                    count_j = (count_j % mod + 1 % mod) % mod;
                    j--;
                }

                //if both are unique elements
                if(x != y)
                    count = (count % mod + (count_i * count_j) % mod) % mod;
                else
                {
                    //If both are same
                    int totalCount = (count_i % mod + count_j + mod) % mod;
                    count = (count + ((totalCount * (totalCount - 1))/2)) % mod;
                }

            }
            else if(arr[i] + arr[j] > k)
                j--;
            else
                i++;
        }
        return (int)count % mod;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 10;
        System.out.println(countPairs(arr,k));

        int[] arr2 = new int[]{1, 2, 2, 2, 4, 4, 4, 4, 5};
        int k1 = 8;
        System.out.println(countPairs(arr2,k1));
    }
}
