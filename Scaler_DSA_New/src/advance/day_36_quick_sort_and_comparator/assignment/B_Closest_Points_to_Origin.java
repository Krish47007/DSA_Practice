package advance.day_36_quick_sort_and_comparator.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class B_Closest_Points_to_Origin {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        Comparator<ArrayList<Integer>> distCmpFromOrigin = (a,b) -> {

            int x1 = a.get(0),y1 = a.get(1);
            int x2 = b.get(0),y2 = b.get(1);

            double d1 = Math.sqrt(x1 * x1 + y1 * y1);
            double d2 = Math.sqrt(x2 * x2 + y2 * y2);

            if(d1 < d2)
                return -1;
            else if(d1 > d2)
                return 1;
            else
                return 0;
        };

        A.sort(distCmpFromOrigin);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0;i<B;i++)
            ans.add(A.get(i));

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    }
}
