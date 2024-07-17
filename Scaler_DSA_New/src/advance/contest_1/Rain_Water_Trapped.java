package advance.contest_1;

public class Rain_Water_Trapped {

    private static int[] buildLeftMax(int[] A)
    {
        int[] lMax = new int[A.length];
        lMax[0] = A[0];

        for(int i = 1;i<A.length;i++)
        {
            lMax[i] = Math.max(lMax[i-1],A[i]);
        }
        return lMax;
    }

    private static int[] buildRightMax(int[] A)
    {
        int n = A.length;
        int[] rMax = new int[n];
        rMax[n-1] = A[n-1];

        for(int i = n-2;i >= 0;i--)
        {
            rMax[i] = Math.max(rMax[i+1],A[i]);
        }
        return rMax;
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int trap(final int[] A) {

        int total = 0;
        int[] lMax = buildLeftMax(A);
        int[] rMax = buildRightMax(A);

        for(int i = 0;i<A.length;i++)
        {
            total += (Math.min(lMax[i],rMax[i]) - A[i]);

        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(trap(new int[]{0,1,0,2}));
        System.out.println(trap(new int[]{1,2}));
    }
}
