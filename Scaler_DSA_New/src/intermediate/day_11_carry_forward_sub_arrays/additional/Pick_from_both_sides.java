package intermediate.day_11_carry_forward_sub_arrays.additional;

public class Pick_from_both_sides {

    private static int[] buildPf(int[] arr)
    {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1;i< arr.length;i++)
            pf[i] = pf[i-1] + arr[i];
        return pf;
    }

    public static int solve(int[] A, int B) {

        int[] pf = buildPf(A);
        int ans = Integer.MIN_VALUE;
        int n = A.length;
        //if all elements need to be picked that is sum of entire array
        if(B == n)
        {
            ans = 0;
            for (int x : A)
                ans+=x;
            return ans;
        }
        for (int i = 0;i<B+1;i++)
        {
            int ls = ( i == 0 ) ? 0 : pf[i-1];
            int rs = pf[n - 1] - pf[(n - 1)- (B - i)];

            ans = Math.max(ans,ls+rs);
        }
        return ans;

    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{2, 3, -1, 4, 2, 1},6));
        System.out.println(solve(new int[]{5, -2, 3 , 1, 2},3));
    }
}
