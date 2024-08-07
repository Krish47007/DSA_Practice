package intermediate.day_11_carry_forward_sub_arrays.additional;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Count_Subarrays {

    public static int solve(int[] A) {

        int ans = 0;
        int modVal = 1000000007;
        int l = 0,r = 0;
        Set<Integer> set = new HashSet<>();
        while (r < A.length )
        {
            while (set.contains(A[r])) {
                //Keep removing until the 1st occurrence of duplicate is there
                //we do this to remove the duplicate counting
                set.remove(A[l]);
                l++;
            }
            //no. of sub-arrays ending at r from l is r-l+1
            ans = ((ans % modVal)+ ((r-l+1) % modVal)) % modVal;
            set.add(A[r]);
            r++;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{1,1,3}));
        System.out.println(solve(new int[]{2,1,2}));
    }
}
