package advance.day_23_bit_manipulation_1.assignment;

public class Set_Bit {

    public static int solve(int A, int B) {

        int n = 0;
        n = (n | (1 << A)) | (1 << B);
        return n;
    }

    public static void main(String[] args) {

        System.out.println(solve(3,5));
        System.out.println(solve(4,4));
    }
}
