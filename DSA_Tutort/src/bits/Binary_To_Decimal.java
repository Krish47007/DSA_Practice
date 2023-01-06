package bits;

public class Binary_To_Decimal {

    public static int getDecimal(int x)
    {
        int ans = 0,i = 0;

        while (x != 0)
        {
            int bit = x & 1;

            ans = (int)(ans + Math.pow(2,i++)*bit);
            x >>=1;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(getDecimal(0B1100));
    }
}
