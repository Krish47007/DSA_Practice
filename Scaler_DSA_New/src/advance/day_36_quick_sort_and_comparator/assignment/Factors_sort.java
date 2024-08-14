package advance.day_36_quick_sort_and_comparator.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Factors_sort {

    private int countFac(int n)
    {
        int count = 0;
        for (int i = 1;i<=Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                if( i != n/i)
                    count+=2;
                else
                    count++;
            }
        }
        return count;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Comparator<Integer> ascFacComp = (a,b) ->{

            int facA = countFac(a),facB = countFac(b);
            if(facA < facB)
                return -1;
            else if(facA > facB)
                return 1;
            else
            {
                if(a <= b)
                    return -1;
                else
                    return 1;
            }
        };

        A.sort(ascFacComp);
        return A;
    }

    public static void main(String[] args) {

        var obj = new Factors_sort();
        ArrayList<Integer> aList = new ArrayList<>(List.of(6, 8, 9));

        for (int x : obj.solve(aList))
            System.out.print(x + " ");
    }
}
