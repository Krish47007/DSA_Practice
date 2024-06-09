package intermediate.day_7_intro_to_prob_solving.classroom;

public class Check_If_Num_Is_Prime {

    private static int countFactors(int n)
    {
        int count = 0;
        for (int i = 1;i * i <= n;i++)
        {
            if( n % i == 0 )
            {
                if( i != n/i)
                    count = count + 2;
                else
                    count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n)
    {
        if( n == 1)
            return false;

        return countFactors(n) == 2;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(1));
        System.out.println(isPrime(24));
        System.out.println(isPrime(96));
        System.out.println(isPrime(17));
    }
}
