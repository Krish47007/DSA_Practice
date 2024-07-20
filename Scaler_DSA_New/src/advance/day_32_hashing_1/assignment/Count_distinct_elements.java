package advance.day_32_hashing_1.assignment;

import java.util.HashSet;
import java.util.Set;

public class Count_distinct_elements {

    public int solve(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int x : A)
            set.add(x);
        return set.size();
    }
}
