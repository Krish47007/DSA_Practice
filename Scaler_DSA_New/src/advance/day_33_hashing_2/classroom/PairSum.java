package advance.day_33_hashing_2.classroom;

import java.util.HashSet;
import java.util.Set;

/* find A[i] + A[j] == k where i !=j */
public class PairSum {

    public static boolean checkPairSum(int [] arr,int k)
    {
        Set<Integer> set = new HashSet<>();
        for (int x : arr)
        {
            if(set.contains(k - x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkPairSum(new int[]{8,9,1,-2,4,5,11,-6,4},6));
        System.out.println(checkPairSum(new int[]{8,9,1,-2,4,5,11,-6,4},22));
    }
}
