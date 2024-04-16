package recursion;

public class Sum_of_Digits {

    public int solve(int A) {

        return sumOfDigit(A);
    }

    private int sumOfDigit(int a) {
        if (a <= 9)
            return a;
        return (a % 10) + sumOfDigit(a / 10);
    }

    public static void main(String[] args) {
        var obj = new Sum_of_Digits();
        System.out.println(obj.sumOfDigit(5));
    }
}
