package recursion;

public class Find_Factorial {

    public int solve(int A) {

        return fac(A);
    }

    private int fac(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fac(n - 1);
    }
}
