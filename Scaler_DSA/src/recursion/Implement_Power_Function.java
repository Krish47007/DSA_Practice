package recursion;

public class Implement_Power_Function {

    public int pow(int A, int B, int C) {
        /*
         *      Divide the problem a^b = (a^b/2) * (a^b/2); if b is even
         *                         a^b = (a^b/2) * (a^b/2) * a; if b is odd.
         *      if a is -ve then to calculate a%p = a%p + p in Java/C/C++
         * */

        if (B == 0)
            return 1 % C;
        long p = pow(A, B / 2, C);
        long prod = p * p;
        int ans = 0;
        if (B % 2 == 0) {
            ans = (int) (prod % C);
            if (ans < 0)
                ans = ans + C;
            return ans;
        } else {
            ans = (int) (((prod % C * (A % C))) % C);
            if (ans < 0)
                ans = ans + C;
            return ans;
        }
    }

    public static void main(String[] args) {
        var obj = new Implement_Power_Function();
        System.out.println(obj.pow(2, 3, 3));
        System.out.println(obj.pow(0, 0, 1));
        System.out.println(obj.pow(-3, 3, 5));
    }
}
