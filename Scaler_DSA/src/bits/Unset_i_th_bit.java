package bits;

public class Unset_i_th_bit {

    public int solve(int A, int B) {

        if ((A & (1 << B)) == (1 << B))
            A ^= (1 << B);
        return A;
    }

    public static void main(String[] args) {
        var obj = new Unset_i_th_bit();
        System.out.println(obj.solve(4, 1));
        System.out.println(obj.solve(5, 2));
    }
}
