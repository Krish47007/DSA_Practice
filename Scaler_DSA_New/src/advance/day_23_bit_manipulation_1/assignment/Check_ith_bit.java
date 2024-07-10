package advance.day_23_bit_manipulation_1.assignment;

public class Check_ith_bit {

    public static int solve(int A, int B) {

        if((A & (1 << B)) == 0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.println(solve(4,1));
        System.out.println(solve(5,2));
    }
}
