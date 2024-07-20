package advance.day_24_bit_manipulation_2.assignment;

public class Single_Number {

    public static int singleNumber(final int[] A) {

        int ans = 0;
        for (int x : A) {
            ans ^= x;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{1,2,2,3,1}));
    }
}
