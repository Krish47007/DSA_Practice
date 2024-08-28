package advance.day_25_recursion_1.classroom;

public class Factorial_Of_A_Number {

    public static long factorial(int n)
    {
        if (n == 0 || n == 1)
            return n;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(20));
    }
}
