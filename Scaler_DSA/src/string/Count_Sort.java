package string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Count_Sort {
/*
    public int[] solve(int[] A) {

        Map<Integer,Integer> map = new TreeMap<>();
        for(int x : A)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int k = 0;
        for (Integer key : map.keySet())
        {
            for(int j = 1;j<=map.get(key);j++)
                A[k++] = key;
        }
        return A;
    }*/

    public int[] solve(int[] A) {

        int max = Integer.MIN_VALUE;
        for (int x : A)
            max = Math.max(max, x);

        int[] freq = new int[max + 1];
        for (int x : A)
            freq[x]++;
        int k = 0;

        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++)
                A[k++] = i;
        }
        return A;

    }

    public static void main(String[] args) {

        var obj = new Count_Sort();
        for (int x : obj.solve(new int[]{1, 5, 2, 3, 1, 6, 5}))
            System.out.print(x + " ");
    }
}
