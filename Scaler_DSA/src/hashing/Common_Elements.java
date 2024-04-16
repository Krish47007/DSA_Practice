package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Common_Elements {

    public int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.

        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        for (int x : A)
            m1.put(x, m1.getOrDefault(x, 0) + 1);
        for (int x : B)
            m2.put(x, m2.getOrDefault(x, 0) + 1);

        List<Integer> ans = new ArrayList<>();
        for (Integer key : m1.keySet()) {
            if (m2.containsKey(key)) {
                for (int i = 1; i <= Math.min(m1.get(key), m2.get(key)); i++)
                    ans.add(key);
            }
        }

        int[] res = new int[ans.size()];
        int k = 0;
        for (int i = 0; i < ans.size(); i++)
            res[k++] = ans.get(i);

        return res;
    }
}
