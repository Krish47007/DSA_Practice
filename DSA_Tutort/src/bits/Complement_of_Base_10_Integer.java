package bits;

public class Complement_of_Base_10_Integer {

    /**
     * If we directly negate the number the it will be overflow as we have 32bits
     * E.g - n = 5
     * 00000000000...101
     * 11111111111...010
     * These extra 1s will cause overflow, actually in our case we want last 3 bits
     * So to prevent this what we can do is we can use mask where all bits are 0 and only the no. of bits
     * from n will be set to 1.
     * <p>
     * n =  00000000000...101
     * ~n =  11111111111...010
     * mask = 00000000000...111
     * ~n & mask = 00000000000...010
     * and we got 1s complement.
     */

    public static int bitwiseComplement(int n) {

        //Special case
        if (n == 0)
            return 1;
        else {
            int k = n;
            int mask = 0;

            while (k != 0) {
                mask = (mask << 1) | 1;
                k >>= 1;
            }

            return ~n & mask;
        }
    }

    public static void main(String[] args) {

        System.out.println(bitwiseComplement(5));
    }
}
