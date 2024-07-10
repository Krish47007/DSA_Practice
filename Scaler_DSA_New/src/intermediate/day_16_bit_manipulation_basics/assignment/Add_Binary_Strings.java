package intermediate.day_16_bit_manipulation_basics.assignment;

public class Add_Binary_Strings {

    public static String addBinary(String A, String B) {

        StringBuilder bigNum;
        StringBuilder smallNum;

        if(A.length() <= B.length()) {
            smallNum = new StringBuilder(A);
            bigNum = new StringBuilder(B);
        }
        else
        {
            smallNum = new StringBuilder(B);
            bigNum = new StringBuilder(A);
        }

        while (smallNum.length() < bigNum.length())
            smallNum.insert(0,"0");

        /*System.out.println("Small Num : "+ smallNum);
        System.out.println("Big Num : "+ bigNum);*/
        int sum = 0,carry = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = smallNum.length() -1 ;i>=0;i--)
        {
           int a =  smallNum.charAt(i) - '0';
           int b =  bigNum.charAt(i) - '0';

           sum = (a + b + carry) % 2;
           carry = (a + b + carry) / 2;
           ans.insert(0,sum);
        }
        if(carry == 1)
            ans.insert(0,carry);

        return ans.toString();
    }

    public static void main(String[] args) {

        //System.out.println(addBinary("100","11"));
        System.out.println(addBinary("110","10"));
    }
}
