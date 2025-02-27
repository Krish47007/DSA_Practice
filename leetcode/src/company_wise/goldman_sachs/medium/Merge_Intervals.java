package company_wise.goldman_sachs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {

    public static int[][] merge(int[][] intervals) {

        //If there's only one interval then no need to merge
        if (intervals.length <= 1)
            return intervals;

        //Sort the array based on start index
        Arrays.sort(intervals, Comparator.comparingInt( a -> a[0]));

        List<int[]> ans = new ArrayList<>();
        //Take the 1st interval and add it to ans.
        //But end index of 1st interval may change depending on next interval values.
        int[] resInterval = intervals[0];
        ans.add(resInterval);

        //System.out.println("res : " + resInterval[0] + resInterval[1]);
        for (int i = 1;i < intervals.length;i++)
        {
            if (intervals[i][0] <= resInterval[1])
                resInterval[1] = Math.max(resInterval[1],intervals[i][1]);
            else
            {
                //set this interval as new disjoint interval
                resInterval = intervals[i];
                ans.add(resInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        for (int [] intervals : merge(new int[][]{{1,3},{2,7},{5,11},{12,15},{17,26}}))
            System.out.println("[ "+intervals[0] + "," + intervals[1]+" ]");
    }
}
