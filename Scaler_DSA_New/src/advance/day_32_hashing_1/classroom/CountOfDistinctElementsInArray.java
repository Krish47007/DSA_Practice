package advance.day_32_hashing_1.classroom;

import java.util.HashSet;
import java.util.Set;

public class CountOfDistinctElementsInArray {

    public static int countDistinctElements(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for (int x : arr)
        {
            set.add(x);
        }
        return set.size();
    }

    public static void main(String[] args) {

        System.out.println(countDistinctElements(new int[]{3,5,6,5,6}));
        System.out.println(countDistinctElements(new int[]{5,5,5}));
    }
}
