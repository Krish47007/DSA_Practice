package sorting;

import java.util.*;

public class Elements_Removal {

    public static int solve(ArrayList<Integer> A) {

        //If we remove larger elements that will contribute to less cost
        //sort the array in descending order.
        A.sort((a, b) -> b - a);

        //Now we see that each element contributes pos times to the actual cost.
        int cost = 0;
        for (int i = 0; i < A.size(); i++)
            cost += (i + 1) * A.get(i);

        return cost;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        /*list.add(2);
        list.add(1);*/
        list.add(5);
        System.out.println(Elements_Removal.solve(list));
    }
}
