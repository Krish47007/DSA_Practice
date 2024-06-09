package intermediate.day_7_intro_to_prob_solving.assignment;

public class Count_Factors_2 {

    public int solve(int n) {

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
}
