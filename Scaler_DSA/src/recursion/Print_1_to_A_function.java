package recursion;

public class Print_1_to_A_function {

    public void solve(int A) {

        printNum(A);
        System.out.println();
    }

    private void printNum(int n) {

        if (n == 0)
            return;
        printNum(n - 1);
        System.out.print(n + " ");
    }
}
