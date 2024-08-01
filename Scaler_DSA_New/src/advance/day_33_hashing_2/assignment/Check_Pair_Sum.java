package advance.day_33_hashing_2.assignment;

import java.util.HashSet;
import java.util.Set;

public class Check_Pair_Sum {

    public static int solve(int A, int[] B) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0;i<B.length;i++)
        {
            int x = A - B[i];
            if(set.contains(x))
                return 1;
            set.add(B[i]);
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(solve(8,new int[]{3, 5, 1, 2, 1, 2}));
        System.out.println(solve(21,new int[]{9, 10, 7, 10, 9, 1, 5, 1, 5}));
    }
}
