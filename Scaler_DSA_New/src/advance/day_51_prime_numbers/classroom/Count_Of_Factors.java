package advance.day_51_prime_numbers.classroom;

public class Count_Of_Factors {

    public static int countFactors(int n)
    {
        int count = 0;
        for (int i = 1;i*i <= n;i++)
        {
            if(n % i == 0)
            {
                if( i != n/i)
                    count+=2;
                else
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countFactors(25));
        System.out.println(countFactors(30));
    }
}
