package intermediate.day_15_sorting_basics.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Elements_Removal {

    public int solve(int[] A) {

        List<Integer> list = Arrays.stream(A)
                                    .boxed()
                                    .collect(Collectors.toList());

        list.sort(Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0;i<list.size();i++)
        {
            sum += (list.get(i) * ( i+1 ));
        }
        return sum;
    }
}
