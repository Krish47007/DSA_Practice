package advance.day_25_recursion_1.assignment;

public class Find_Fibonacci_II {

    public static int fib(int n)
    {
        if( n <= 1 )
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static int findAthFibonacci(int A) {

        return fib(A);
    }

    public static void main(String[] args) {

        System.out.println(findAthFibonacci(2));
        System.out.println(findAthFibonacci(2));

        System.out.println(findAthFibonacci(5));
    }
}
