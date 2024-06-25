package advance.day_20_1D_Array.assignment;

public class Rain_Water_Trapped {

    private static int[] buildLMax(int[] A)
    {
        int[] pf = new int[A.length];
        pf[0] = A[0];

        for (int i = 1;i<A.length;i++)
        {
            pf[i] = Math.max(pf[i-1],A[i]);
        }
        return pf;
    }
    private static int[] buildRMax(int[] A)
    {
        int n = A.length;
        int[] pf = new int[n];
        pf[n-1] = A[n-1];

        for (int i = n-2;i >= 0;i--)
        {
            pf[i] = Math.max(pf[i+1],A[i]);
        }
        return pf;
    }
    public static int trap(final int[] A) {

        int[] lMax = buildLMax(A);
        int[] rMax = buildRMax(A);

        int ans = 0;

        for (int i = 0;i<A.length;i++)
        {
            ans = ans + (Math.min(lMax[i],rMax[i]) - A[i]);
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(trap(new int[]{0,1,0,2}));
        System.out.println(trap(new int[]{1,2}));
    }
}
