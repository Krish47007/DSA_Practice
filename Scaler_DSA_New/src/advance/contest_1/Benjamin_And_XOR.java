package advance.contest_1;

public class Benjamin_And_XOR {

    private static boolean isIthBitSet(int n,int i)
    {
        if( (n & (1 << i)) != 0)
            return true;

        return false;
    }

    public static int[] solve(int[] A, int[] B) {

        int[] ans = new int[B.length];

        for(int i = 0;i<B.length;i++)
        {
            int idx = B[i];
            int count = 0;

            for(int j = 0;j<A.length;j++)
            {
                for(int k = j+1;k<A.length;k++)
                {
                    if(isIthBitSet(A[j] ^ A[k], idx))
                        count++;
                }
            }

            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {

        /*int[] A = {1,2,3};
        int[] B = {0,1};*/

        int[] A = {2,4,7,11};
        int[] B = {3};

        for (int x : solve(A,B))
            System.out.print(x+" ");
    }

}
