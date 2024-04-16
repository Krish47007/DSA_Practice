package bits;

public class Decimal_To_Binary {

    public static void printBinary(int x) {
        StringBuilder ans = new StringBuilder();
        while (x != 0) {
            ans.insert(0, x % 2);
            x /= 2;

        }
        System.out.println(ans);
    }

    public static int getBinary(int x) {
        //using bit concepts
        int ans = 0, i = 0;

        while (x != 0) {
            int bit = x & 1;

            ans = (int) (ans + (bit * Math.pow(10, i++)));

            x >>= 1;

        }
        return ans;
    }

    public static void main(String[] args) {

        printBinary(1578946423);

        System.out.println(getBinary(12));
    }
}
