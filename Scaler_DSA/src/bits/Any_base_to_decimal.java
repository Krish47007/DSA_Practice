package bits;

public class Any_base_to_decimal {

    public int solve(int A, int B) {

        int num = 0, k = 0;

        while (A > 0) {
            num += A % 10 * Math.pow(B, k++);
            A /= 10;
        }

        return num;
    }

    public static void main(String[] args) {

        var obj = new Any_base_to_decimal();
        System.out.println(obj.solve(1010, 2));
        System.out.println(obj.solve(22, 3));
    }
}
