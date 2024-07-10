package advance.day_25_recursion_1.assignment;

public class Find_Factorial {

    public int solve(int A) {

        return fac(A);
    }

    private static int fac(int n) {

        if(n <= 2)
            return n;
        return n * fac(n-1);
    }

    public static void main(String[] args) {

        System.out.println(fac(5));
    }
}
