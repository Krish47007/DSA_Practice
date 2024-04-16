package recursion;

import java.util.HashMap;
import java.util.Map;

public class Is_magic {

    private Map<Integer, Integer> cache = new HashMap<>();

    private int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int solve(int A) {

        if (A <= 9) {
            if (A == 1)
                return 1;
            else
                return 0;
        }
        int sum = cache.getOrDefault(A, 0);
        if (sum != 0)
            return solve(sum);
        else {
            int sumOfDigits = getSumOfDigits(A);
            cache.put(A, sumOfDigits);
            return solve(sumOfDigits);
        }

    }

    public static void main(String[] args) {

        var obj = new Is_magic();
        System.out.println(obj.solve(83557));
    }
}
