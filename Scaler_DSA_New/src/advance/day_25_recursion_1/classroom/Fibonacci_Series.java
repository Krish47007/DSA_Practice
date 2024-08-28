package advance.day_25_recursion_1.classroom;

public class Fibonacci_Series {

    public int fib(int n)
    {
        if( n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib( n - 2);
    }


}
