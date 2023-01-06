package searching;

public class Pow {
    /*
    * implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    * */

    public static double myPow(double x, int n) {

        return n < 0 ? 1/calPow(x,-n) : calPow(x,n);
    }

    private static double calPow(double x, long n) {

        if( n == 0)
            return 1;
        else if(n == 1)
            return x;
        else
        {
            return n % 2 == 0 ? calPow(x*x,n/2) : x * calPow(x*x,(n-1)/2);
        }
    }

    public static double myPower(double x, int n)
    {
        long N = n < 0 ? -n : n;
        double ans = 1;

        while (N > 0)
        {
            if( N %2 == 1)
            {
                ans = ans * x;
                N = N - 1;
            }
            else
            {
                x = x * x;
                N = N/2;
            }
        }
        return n < 0 ? (double)1/ans : ans;
    }

    public static void main(String[] args) {

        System.out.println(myPower(2,10));
    }
}
