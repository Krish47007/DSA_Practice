package advance.day_23_bit_manipulation_1.assignment;

public class Number_of_1_Bits {

    public static int numSetBits(int n) {

        int ans = 0;
        while (n > 0)
        {
            if( (n & 1) == 1)
                ans++;

            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(numSetBits(11));
        System.out.println(numSetBits(6));
    }
}
