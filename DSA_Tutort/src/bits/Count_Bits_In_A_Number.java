package bits;

public class Count_Bits_In_A_Number {

    public static int countBits(int x) {
        int count = 0;

        while (x != 0) {
            count++;
            x = x >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countBits(5));
        System.out.println(countBits(10));
        System.out.println(countBits(25));
        System.out.println(countBits(0));
        // System.out.println(countBits(-5));
    }
}
