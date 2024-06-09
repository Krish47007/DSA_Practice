package intermediate.day_7_intro_to_prob_solving.additional;

public class Find_Perfect_Numbers {

    public static int solve(int n) {

        if (n == 1)
            return 0;

        int sum = 0;
        for (int i = 1;i*i <= n;i++)
        {
            if( n % i == 0)
            {
                sum+=i;
                if(i != 1 && n/i != i)
                    sum+= n/i;
            }
        }
        return sum == n ? 1 : 0;
    }

    public static void main(String[] args) {

        System.out.println(solve(4));
        System.out.println(solve(6));
    }
}
