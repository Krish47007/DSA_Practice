package advance.day_68_dp_1D.assignment;

public class Fibonacci_Number {

    public int fib(int n)
    {
        if(n == 0 || n == 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2;i<=n;i++)
        {
            sum = a + b;
            a = b;
            b = sum;
        }

        return sum;
    }
}
