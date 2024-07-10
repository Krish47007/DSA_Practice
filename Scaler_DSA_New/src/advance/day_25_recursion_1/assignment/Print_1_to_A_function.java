package advance.day_25_recursion_1.assignment;

public class Print_1_to_A_function {

    private static void printNum(int n)
    {
        if( n == 0) return;
        printNum(n-1);
        System.out.print(n + " ");
    }
    public static void solve(int A) {

        printNum(A);
    }

    public static void main(String[] args) {

        solve(10);
        System.out.println();
    }
}
