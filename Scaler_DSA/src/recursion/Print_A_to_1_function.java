package recursion;

public class Print_A_to_1_function {

    public void solve(int A) {

        printNum(A);
        System.out.println();
    }

    private void printNum(int n) {

        if (n == 0)
            return;
        System.out.print(n + " ");
        printNum(n - 1);
    }
}
