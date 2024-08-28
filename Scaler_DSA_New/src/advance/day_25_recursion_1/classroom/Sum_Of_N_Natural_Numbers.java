package advance.day_25_recursion_1.classroom;

public class Sum_Of_N_Natural_Numbers {

    public static int sum(int n)
    {
        if( n == 1)
            return 1;
        else
            return n + sum(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sum(8));
    }
}
