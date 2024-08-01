package intermediate.day_10_prefix_sum.additional;

public class Equilibrium_index_of_an_array {

    private static int[] buildPrefixArray(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1;i<arr.length;i++)
            pf[i] = pf[i-1] + arr[i];

        return pf;
    }

    public static int solve(int[] A) {

        int[] pf = buildPrefixArray(A);
        int ans = -1;

        for (int i = 0;i<pf.length;i++)
        {
            int ls = 0,rs = 0;
            if (i == 0)
                rs = pf[A.length - 1] - pf[i];
            else {
                ls = pf[i-1];
                rs = pf[A.length - 1] - pf[i];
            }
            if(ls == rs)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{-7, 1, 5, 2, -4, 3, 0}));
        System.out.println(solve(new int[]{1,2,3}));
        System.out.println(solve(new int[]{1}));
    }
}
