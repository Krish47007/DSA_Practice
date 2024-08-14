package advance.day_36_quick_sort_and_comparator.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Largest_Number {

    public String largestNumber(ArrayList<Integer> A) {

        Comparator<Integer> numCmp = (a,b) -> {
            String x = a.toString() + b;
            String y = b.toString() + a;
            /*
            *    x = a+b and y = b+a
            *   Now if x > y we need a as op so return -1
            * else we need b as op so return 1.

                    x.compareTo(y):

                    This is the standard way of comparing two objects in ascending order. It returns:

                    A negative integer if x is less than y.
                    Zero if x is equal to y.
                    A positive integer if x is greater than y.

                    y.compareTo(x):

                    This effectively reverses the comparison order. It returns:

                    A negative integer if y is less than x.
                    Zero if y is equal to x.
                    A positive integer if y is greater than x.
            *
            * */
            return y.compareTo(x);
        };

        A.sort(numCmp);
        StringBuilder sb = new StringBuilder();
        boolean allZeros = true;
        for (int i = 0;i<A.size();i++) {
            if(A.get(i) != 0 )
                allZeros = false;
            sb.append(A.get(i));
        }

        return allZeros ? "0" : sb.toString();
    }

    public static void main(String[] args) {

        var obj = new Largest_Number();
        System.out.println(obj.largestNumber(new ArrayList<>(List.of(3, 30, 34, 5, 9))));
        System.out.println(obj.largestNumber(new ArrayList<>(List.of(2, 3, 9, 0))));
    }
}
