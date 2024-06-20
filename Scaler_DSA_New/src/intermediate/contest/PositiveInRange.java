package intermediate.contest;

public class PositiveInRange {

    private static int[] buildPfCountArray(int[] A)
    {
        int[] pf = new int[A.length];
        pf[0] = (A[0] >= 0) ? 1 : 0;

        for(int i = 1;i<A.length;i++)
        {
            pf[i] = pf[i-1] + ((A[i] >= 0) ? 1 : 0);
        }

        return pf;
    }

    public static int[] solve(int[] A, int[][] B) {

        int[] ans = new int[B.length];
        int[] pf = buildPfCountArray(A);

        for(int i = 0;i<B.length;i++)
        {
            int p = B[i][0], q = B[i][1];

            if( p == 0)
                ans[i] = pf[q];
            else
                ans[i] = pf[q] - pf[p-1];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][]B = {{0,2},{1,1}};
        int[] A = {1,-1,0};

        int[] ans = solve(A,B);

        for (int x : ans)
            System.out.print(x +" ");
    }
}

