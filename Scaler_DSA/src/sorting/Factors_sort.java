package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Factors_sort {

    private static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n / i)
                    count += 2;
                else
                    count++;
            }
        }

        return count;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> list) {

        Collections.sort(list, (a, b) -> {
            int facA = countFactors(a);
            int facB = countFactors(b);
            System.out.println("Fac of " + a + " : " + facA);
            System.out.println("Fac of " + b + " : " + facB);
            if (facA < facB)
                return -1;
            else if (facA == facB) {
                if (a <= b)
                    return -1;
                return 1;
            } else
                return 1;

        });

        return list;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(9);
        list.add(8);
        // list.sort(Comparator.naturalOrder());
        System.out.println(solve(new ArrayList<>(List.of(13, 13, 37, 43, 7, 26, 27, 28, 36))));
    }
}
