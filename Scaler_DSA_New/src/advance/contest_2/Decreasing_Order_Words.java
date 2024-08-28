package advance.contest_2;

import java.util.*;

public class Decreasing_Order_Words {

    public static ArrayList<String> solve(ArrayList<String> A) {

        Comparator<String> strCmp = (a, b) ->{

            if(a.length() < b.length())
                return 1;
            else if(a.length() > b.length())
                return -1;
            else
            return 0;
        };

        A.sort(strCmp);
        return A;
    }

    public static void main(String[] args) {

       // ArrayList<String> list = new ArrayList<>(List.of("hi","he","hello"));
        ArrayList<String> list = new ArrayList<>(List.of("cat","bat","could","but"));

        for (String x : solve(list))
            System.out.print(x + " ");
    }
}
