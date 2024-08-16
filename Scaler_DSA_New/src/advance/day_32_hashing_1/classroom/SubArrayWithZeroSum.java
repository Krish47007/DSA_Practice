package advance.day_32_hashing_1.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    public static int subArrayExists(int[] arr)
    {
      long[] pf = new long[arr.length];
      int ans = 0;
      pf[0] = arr[0];
      Set<Long> set = new HashSet<>();
      if(pf[0] == 0)
          return 1;
      set.add(pf[0]);

      for (int i = 1;i<arr.length;i++)
      {
          pf[i] = pf[i-1] + arr[i];
          if(pf[i] == 0 || !set.add(pf[i]))
          {
              ans = 1;
              break;
          }
      }
      return ans;

    }

    public static void main(String[] args) {

        System.out.println(subArrayExists(new int[]{1,2,3,4,5}));
        System.out.println(subArrayExists(new int[]{4,-1,1}));
        System.out.println(subArrayExists(new int[]{4,0,2}));
        System.out.println(subArrayExists(new int[]{0,2}));
    }
}
