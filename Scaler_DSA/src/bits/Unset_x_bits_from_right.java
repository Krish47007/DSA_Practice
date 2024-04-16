package bits;

public class Unset_x_bits_from_right {

    public long solve(long A, int B) {

        int i = 0;
        while (i <= B - 1) {
            if ((A & (1 << i)) == (1 << i))
                A ^= (1L << i);
            i++;
        }
        return A;
    }

    public static void main(String[] args) {

        var obj = new Unset_x_bits_from_right();
        System.out.println(obj.solve(25, 3));
        System.out.println(obj.solve(37, 3));
    }
}
