package hashing;

import java.util.*;

public class First_Repeating_element {

    public int solve(int[] A) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                map.get(A[i]).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                map.put(A[i], indexList);
            }
        }

        //All are unique elements
        if (map.size() == A.length)
            return -1;

        int ans = -1, pos = Integer.MAX_VALUE;
        for (int x : A) {
            if (map.containsKey(x) && map.get(x).size() > 1) {
                int temp = map.get(x).get(0);
                if (temp < pos) {
                    pos = temp;
                    ans = x;
                }
            }
        }

        return ans;
    }
}
