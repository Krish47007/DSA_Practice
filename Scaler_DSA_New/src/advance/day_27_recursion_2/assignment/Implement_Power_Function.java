package advance.day_27_recursion_2.assignment;

public class Implement_Power_Function {


    public static int pow(int a, int b, int c) {

        if(b == 0)
            return 1 % c;

        long ans = pow(a,b/2,c) % c;

        ans = ( ans * ans ) % c;

        if( b % 2 == 1)
           ans = (a * ans) % c;

        //Handle -ve case
        ans = (ans + c) % c;

        return (int)ans;
    }

    public static void main(String[] args) {

        System.out.println(pow(2,3,3));
        System.out.println(pow(3,3,1));
    }
}
