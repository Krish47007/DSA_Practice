package advance.day_32_hashing_1.assignment;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_element_query {

    public static int[] solve(int[] A, int[] B) {

        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int x : A)
        {
            freqMap.put(x,freqMap.getOrDefault(x,0)+1);
        }

        int[] ans = new int[B.length];

        for (int i = 0;i<B.length;i++)
        {
            ans[i] = freqMap.getOrDefault(B[i],0);
        }
        return ans;
    }

    public static void main(String[] args) {

      int[] A = {2, 5, 9, 2, 8}, B = {3,2};

      for (int x : solve(A,B))
          System.out.print(x+" ");
    }
}
