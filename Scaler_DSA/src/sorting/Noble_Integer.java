package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Noble_Integer {

    public static int solve(ArrayList<Integer> A) {

        //Descending order
        A.sort(Comparator.reverseOrder());

        if (A.get(0) == 0)
            return 1;
        int count = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i - 1) != A.get(i))
                count = i;
            if (A.get(i) == count)
                return 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(Noble_Integer.solve(new ArrayList<>(List.of(3, 2, 1, 3))));
        System.out.println(Noble_Integer.solve(new ArrayList<>(List.of(1, 1, 3, 3))));
        System.out.println(Noble_Integer.solve(new ArrayList<>(List.of(3, 2, 1, 3))));
        System.out.println(Noble_Integer.solve(new ArrayList<>(List.of(-6, -1, 4))));
        System.out.println(Noble_Integer.solve(new ArrayList<>(List.of(3, 1))));
    }
}
