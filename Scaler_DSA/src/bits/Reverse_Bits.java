package bits;

import java.util.Locale;

public class Reverse_Bits {

    /*
     * Steps:
     *   1. Left Shift the result by 1 bit.
     *   2. Check the LSB of the given number N, if its 1 then add/OR 1 to the result.
     *   3. Right shift N by 1
     * */
    public long reverse(long A) {
        long result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((A & 1) == 1)
                result = result | 1;
            A = A >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        var obj = new Reverse_Bits();
        // System.out.println(obj.reverse(0));
        System.out.println(obj.reverse(3));
    }
}
