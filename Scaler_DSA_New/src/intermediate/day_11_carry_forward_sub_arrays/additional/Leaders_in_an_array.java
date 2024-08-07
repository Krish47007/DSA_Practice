package intermediate.day_11_carry_forward_sub_arrays.additional;

import java.util.ArrayList;

public class Leaders_in_an_array {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> leaders = new ArrayList<>();
        int max = A.get(A.size() - 1);
        //last element is always leader
        leaders.add(max);

        for (int i = A.size() - 2;i>=0;i--)
        {
            if(A.get(i) > max)
            {
                max = A.get(i);
                leaders.add(max);
            }
        }
        return leaders;

    }
}
