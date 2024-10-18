package advance.day_51_prime_numbers.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Count_Of_Divisors {

    /*
    Can you think of a way to use the Sieve of Eratosthenes concept to count factors for all numbers up to the maximum element in A?
     */
    private int[] getCountOfFac(int n)
    {
        int[] fac = new int[n+1];

        for (int i = 1;i<=n;i++)
        {
            fac[i]++;
            int j = 2 * i;
            while (j <= n)
            {
                fac[j]++;
                j = j + i;
            }
        }
        return fac;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();

        int maxElem = A.get(0);
        for (int i = 1;i<A.size();i++)
            maxElem = Math.max(maxElem,A.get(i));

        int[] factors = getCountOfFac(maxElem);
        for (int x : A)
        {
            ans.add(factors[x]);
        }
        return ans;
    }

    public static void main(String[] args) {

        var obj = new Count_Of_Divisors();
        //System.out.println(obj.getCountOfFac(10));
        System.out.println(obj.solve(new ArrayList<>(List.of(2,3,4,5))));
        System.out.println(obj.solve(new ArrayList<>(List.of(1,2,8,9,10))));
    }
}
