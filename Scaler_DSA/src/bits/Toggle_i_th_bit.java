package bits;

public class Toggle_i_th_bit {

    public int solve(int A, int B) {

        A = A ^ (1 << B);
        return A;
    }

    public static void main(String[] args) {

        var obj = new Toggle_i_th_bit();
        System.out.println(obj.solve(4, 1));
        System.out.println(obj.solve(5, 2));
    }
}
