package intermediate.day_15_sorting_basics.assignment;

import java.util.ArrayList;
import java.util.Comparator;

public class Noble_Integer {

    public int solve(ArrayList<Integer> A) {

        A.sort(Comparator.reverseOrder());

        int isPresent = -1;
        int[] countSmallElem = new int[A.size()];

        for (int i = 0;i < A.size();i++)
        {
            if( i == 0)
                countSmallElem[i] = 0;
            else if( A.get(i).equals(A.get(i-1)))
                countSmallElem[i] = countSmallElem[i-1];
            else
                countSmallElem[i] = i;
        }

        for (int i = 0;i<countSmallElem.length;i++)
        {
            if(A.get(i) == countSmallElem[i]) {
                isPresent = 1;
                break;
            }
        }
        return isPresent;
    }
}
