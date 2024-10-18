package advance.day_51_prime_numbers.assignment;

public class Sorted_Permutation_Rank {

    private int fac(int n,int mod)
    {
        if( n <= 1)
            return 1;
        int prod = 1;

        for (int i = 2;i<=n;i++)
            prod = (prod * i) % mod;

        return prod;
    }
    public int findRank(String A) {

        int rank = 0;
        int mod = 1000003;
        int n = A.length();
        for (int i = 0;i<n;i++)
        {
            char ch = A.charAt(i);
            int count = 0;
            for (int j = i+1;j<n;j++)
            {
                if (A.charAt(j) < ch)
                    count++;
            }

            rank = (rank + count * fac(n-1-i,mod)) % mod;
        }

        return rank + 1;
    }

    public static void main(String[] args) {

        var obj = new Sorted_Permutation_Rank();
        System.out.println(obj.findRank("cab"));
    }
}
