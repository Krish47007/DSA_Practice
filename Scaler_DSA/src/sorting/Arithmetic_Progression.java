package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arithmetic_Progression {

    public static int solve(ArrayList<Integer> A) {

        A.sort(Comparator.naturalOrder());

        int cd = A.get(1) - A.get(0);
        for (int i = 2; i < A.size(); i++) {
            if (A.get(i) - A.get(i - 1) != cd)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(List.of(3, 5, 1))));
        System.out.println(solve(new ArrayList<>(List.of(2, 4, 1))));
        System.out.println(solve(new ArrayList<>(List.of(2, 4))));
    }
}
