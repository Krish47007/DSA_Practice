package bits;

public class Decimal_to_Any_Base {

/*    public int DecimalToAnyBase(int A, int B) {

        StringBuilder sb = new StringBuilder();
        if(A == 0)
            sb.append(0);
        while (A > 0)
        {
            sb.append(A%B);
            A/=B;
        }
        return Integer.parseInt(sb.reverse().toString());
    }*/

    public int DecimalToAnyBase(int A, int B) {

        int res = 0;
        int pow = 1;
        while (A > 0) {
            int r = A % B;
            res += r * pow;
            pow = pow * 10;
            A = A / B;
        }
        return res;
    }

    public static void main(String[] args) {

        var obj = new Decimal_to_Any_Base();
        System.out.println(obj.DecimalToAnyBase(4, 3));
        System.out.println(obj.DecimalToAnyBase(4, 2));
    }
}
