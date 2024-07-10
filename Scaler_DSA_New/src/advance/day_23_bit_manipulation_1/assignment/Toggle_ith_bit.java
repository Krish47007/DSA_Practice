package advance.day_23_bit_manipulation_1.assignment;

public class Toggle_ith_bit {

    public static int solve(int A, int B) {

        return A ^ ( 1 << B);
    }

    public static void main(String[] args) {

        System.out.println(solve(4,1));
        System.out.println(solve(5,2));
    }
}
