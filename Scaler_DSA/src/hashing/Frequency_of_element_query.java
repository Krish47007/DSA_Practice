package hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_element_query {

    public int[] solve(int[] A, int[] B) {

        int[] res = new int[B.length];
        int k = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < B.length; i++) {
            res[i] = map.getOrDefault(B[i], 0);
        }
        return res;
    }
}
