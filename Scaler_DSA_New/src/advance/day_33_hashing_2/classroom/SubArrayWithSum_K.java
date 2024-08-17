package advance.day_33_hashing_2.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSum_K {

    public static boolean subArrayWithSum_K(int[] arr,int k)
    {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int i = 0;i< arr.length;i++)
        {
            prefixSum += arr[i];
            if(prefixSum == k)
                return true;
            else if(set.contains(prefixSum - k))
                return true;
            else
                set.add(prefixSum);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(subArrayWithSum_K(new int[]{2,3,9,-4,1,5},8));
        System.out.println(subArrayWithSum_K(new int[]{2,3,9,-4,1,5},11));
        System.out.println(subArrayWithSum_K(new int[]{2,3,9,-4,1,5},15));
    }
}
