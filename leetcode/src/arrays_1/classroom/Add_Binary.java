package arrays_1.classroom;

public class Add_Binary {

    public static String addBinary(String a, String b) {

        String small = (a.length() <= b.length()) ? a : b;
        String big = a.length() > b.length() ? a : b;

        while (small.length() < big.length())
            small = "0"+small;

        int carry = 0;
        boolean allZeros = true;
        StringBuilder sb = new StringBuilder();
        for (int i = small.length() - 1;i >= 0;i--)
        {
            int x = small.charAt(i) - '0', y = big.charAt(i) - '0';
            if( x != 0 || y != 0)
                allZeros = false;
            sb.insert(0,(x+y+carry) % 2);
            carry = (x+y+carry) /2;
        }
        if(allZeros)
            return "0";
        else
        {
            if(carry == 1)
                return sb.insert(0,1).toString();
            return sb.toString();
        }

    }

    public static void main(String[] args) {

        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010","1011"));
        System.out.println(addBinary("00","00000"));
    }
}
