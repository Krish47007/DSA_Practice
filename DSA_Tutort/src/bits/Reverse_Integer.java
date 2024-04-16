package bits;

public class Reverse_Integer {

    public static int reverse(int n) {

        int rev = 0;
        while (n != 0) {
            int r = n % 10;

            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) //otherwise line 15 will cause overflow.
                return 0;

            rev = rev * 10 + r;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverse(108));
    }
}
