package arrays.competition_1;

public class Range_Primes {

    private boolean isPrime(int n) {
        boolean ans = true;
        if (n == 1)
            return ans = false;
        else if (n == 2)
            return ans;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ans = false;
                    break;
                }
            }
            return ans;
        }
    }

}
