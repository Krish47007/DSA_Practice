package advance.day_27_recursion_2.classroom;

public class Power_Impl_2 {

    // This is called fast power or fast exponentiation.
    public static int pow(int a,int b)
    {
        if(b == 0)
            return 1;

        int p = pow(a,b/2);

        if( b % 2 == 0)
            return p * p;
        else
            return a * p * p;
    }

    public static void main(String[] args) {

        System.out.println(pow(2,10));
    }
}
