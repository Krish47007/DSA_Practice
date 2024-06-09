package intermediate.day_7_intro_to_prob_solving.classroom;

public class Count_Factors_Of_A_Num {

    public static int countFactors(int n)
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

    public static void main(String[] args) {

        System.out.println(countFactors(6));
        System.out.println(countFactors(5));
        System.out.println(countFactors(1));
        System.out.println(countFactors(25));
    }
}
