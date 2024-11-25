package advance.day_68_dp_1D.classroom;

public class Nth_Fibonacci_Num {

    /*
        T.C - O(2^N)
        S.C - O(N)
     */
    public static int fib(int n)
    {
        if (n == 0 || n== 1)
            return n;

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(4));
    }
}
