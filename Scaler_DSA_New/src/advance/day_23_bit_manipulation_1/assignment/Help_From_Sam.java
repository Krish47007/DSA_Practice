package advance.day_23_bit_manipulation_1.assignment;

public class Help_From_Sam {

    public static int solve(int A) {

        int helpCount = 0;

        while (A > 0)
        {
            if( (A & 1) != 0) {
                helpCount++;
                A--;
            }
            else
                A >>=1;
        }
        return helpCount;
    }

    public static void main(String[] args) {

        System.out.println(solve(17));
    }
}
