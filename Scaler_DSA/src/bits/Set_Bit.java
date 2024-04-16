package bits;

public class Set_Bit {

    public int solve(int A, int B) {

        int n = 0;
        n = n | (1 << A);
        n = n | (1 << B);

        return n;
    }

    public static void main(String[] args) {
        var obj = new Set_Bit();
        System.out.println(obj.solve(3, 5));
        System.out.println(obj.solve(4, 4));
    }
}
