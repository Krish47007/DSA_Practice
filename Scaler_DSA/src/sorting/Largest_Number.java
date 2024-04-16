package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Largest_Number {

    public static String largestNumber(final List<Integer> A) {

        boolean allZeroes = true;
        for (int x : A) {
            if (x != 0) {
                allZeroes = false;
                break;
            }
        }
        if (allZeroes)
            return "0";

        A.sort((a, b) -> {

            long x = Long.parseLong(a.toString() + b);
            long y = Long.parseLong(b.toString() + a);

            if (y > x)
                return 1;
            else
                return -1;
        });

        String ans = "";
        for (int x : A)
            ans += x;

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(largestNumber(new ArrayList<>(List.of(3, 30, 34, 5, 9))));
        System.out.println(largestNumber(new ArrayList<>(List.of(3, 30, 34, 5, 9, 74))));
        System.out.println(largestNumber(new ArrayList<>(List.of(2, 3, 9, 0))));
        System.out.println(largestNumber(new ArrayList<>(List.of(0))));
    }
}
