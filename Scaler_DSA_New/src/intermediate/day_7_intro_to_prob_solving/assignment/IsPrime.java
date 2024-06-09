package intermediate.day_7_intro_to_prob_solving.assignment;

public class IsPrime {

    public int countFactors(int n) {

        int count = 0;

        for (int i = 1; i * i <= n;i++)
        {
            if(n % i == 0)
            {
                if(i != n/i)
                    count+=2;
                else
                    count++;
            }
        }
        return count;
    }

    public int solve(int n) {

        return countFactors(n) == 2 ? 1 : 0;
    }
}
