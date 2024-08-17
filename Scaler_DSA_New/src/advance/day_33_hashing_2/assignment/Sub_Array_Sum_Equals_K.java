package advance.day_33_hashing_2.assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sub_Array_Sum_Equals_K {


    private static int[] buildPf(int[] A) {
        int[] pf = new int[A.length];
        pf[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        return pf;
    }

    /*
        Pf[R] - Pf[L-1] = B
        so we need to check if there's pf which is exactly B less than pf[i]
        as Pf[R] - B = Pf[L-1]
     */
    public static int solve(int[] A, int B) {
        int[] pf = buildPf(A);
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < pf.length; i++) {
            // Check if the current prefix sum equals B
            if (pf[i] == B) {
                count++;
            }

            // Check if there is a prefix sum that is exactly B less than the current prefix sum
            if (map.containsKey(pf[i] - B)) {
                count += map.get(pf[i] - B);
            }

            // Update the frequency of the current prefix sum in the hashmap
            map.put(pf[i], map.getOrDefault(pf[i], 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 0, 1};
        int B1 = 1;
        System.out.println(solve(A1, B1)); // Output: 4

        int[] A2 = {0, 0, 0};
        int B2 = 0;
        System.out.println(solve(A2, B2)); // Output: 6
    }

}
