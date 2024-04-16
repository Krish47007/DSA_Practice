package string;

/*Since the sizes of the two strings may be different, we first make the size of the smaller string equal to that of the bigger one by adding leading 0s for simplicity. Note that you can handle the addition without adding zeroes by adding a few if statements. After making sizes the same, we add bits from the rightmost bit to the leftmost bit.
In every iteration, we must sum 3 bits: 2 bits of 2 given strings and carry.
The sum bit will be 1 if all 3 bits are set, or one of them is set.

So we can add all the bits and then take the remainder with 2 to get the current bit in the answer.
 How to find the carryover? Carry will be 1 if any of the two bits is set. So we can find carry by adding the bits and
 dividing the result by 2. Following is a step-by-step algorithm: 1.
 Make them equal-sized by adding 0s at the beginning of the smaller string. 2.
 Perform bit addition Boolean expression for adding 3 bits a, b, c Sum = (a + b + c) % 2 Carry = (a + b + c ) / 2
*/
public class Add_Binary_Strings {

    public String addBinary(String A, String B) {

        StringBuilder[] ret = processStrings(A, B);
        int length = ret[0].length();
        int sum = 0, carry = 0;
        StringBuilder ans = new StringBuilder();
        String str1 = ret[0].toString();
        String str2 = ret[1].toString();

        for (int i = length - 1; i >= 0; i--) {
            int bitSum = carry + str1.charAt(i) - '0' + str2.charAt(i) - '0';
            sum = bitSum % 2;
            carry = bitSum / 2;
            ans.insert(0, sum);
        }

        if (carry != 0)
            ans.insert(0, carry);

        return ans.toString();

    }

    private StringBuilder[] processStrings(String A, String B) {
        StringBuilder small = new StringBuilder();
        StringBuilder large = new StringBuilder();

        if (A.length() != B.length()) {
            if (A.length() > B.length()) {
                small.append(B);
                large.append(A);
            } else {
                small.append(A);
                large.append(B);
            }
            while (small.length() < large.length()) {
                small.insert(0, "0");
            }
        } else {
            small.append(A);
            large.append(B);
        }

        return new StringBuilder[]{small, large};
    }

    public static void main(String[] args) {

        var obj = new Add_Binary_Strings();
        // System.out.println(obj.addBinary("1010110111001101101000","1000011011000000111100110"));
        System.out.println(obj.addBinary("100", "111"));
    }
}
