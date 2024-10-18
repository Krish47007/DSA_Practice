package advance.day_50_combinatorics.assignment;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

/*
  Its based on the following combination formula :
        ncr = n-1Cr-1 + n-1Cr
 */

    //Submitted in leetcode
    public static List<List<Integer>> solve(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0;i<n;i++)
        {
            List<Integer> row = new ArrayList<>();
            //1st element is always 1.
            row.add(1);

            for (int j = 1;j < i;j++)
            {
                row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }

            //last element is 1 again if its not 1st row
            if(i > 0)
                row.add(1);

            //add row to ans
            ans.add(row);
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(5));
    }
}
