package advance.day_51_prime_numbers.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_All_Primes {

    /*
        This is an application of Sieve of Eratosthenes -
        TC - O(N * log(log N))
     */
    public static ArrayList<Integer> solve(int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (n <= 1)
            return ans;

        boolean[] isPrime = new boolean[n + 1];

        //Initially all are prime
        Arrays.fill(isPrime, true);
        //0 and 1 are not prime
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= n; i++) {
            //Prime number
            if (isPrime[i])
                ans.add(i);

            int j = 2 * i;

            //Make all multiples of i as non-prime
            while (j <= n) {
                isPrime[j] = false;
                j = j + i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(25));
    }
}
