package advance.day_36_quick_sort_and_comparator.additional;

import java.util.*;

public class Tens_Digit_Sorting {

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        Comparator<Integer> tensDigitComp = (a,b) -> {

            int aTens = ( a / 10) == 0 ? 0 : (a/10) % 10;
            int bTens = ( b / 10) == 0 ? 0 : (b/10) % 10;

            if(aTens < bTens)
                return -1;
            else if (aTens > bTens)
                return 1;
            else
            {
                if(a < b)
                    return 1;
                else if( a > b)
                    return -1;
                return 0;
            }
        };

        Collections.sort(A,tensDigitComp);
        return A;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(2, 24, 22, 19));

        for (int x : solve(list))
            System.out.print(x + " ");
    }
}
