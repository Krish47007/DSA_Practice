package advance.contest_1;

public class Chef_And_Cooking {

    public static long solve(int[] A) {

        long ans = A[0];
        long sum = A[0];

        for(int i = 1;i<A.length;i++)
        {
            if(A[i] > A[i-1])
            {
                sum = sum + A[i];
                ans = Math.max(ans,sum);
            }
            else
                //reset sum
                sum = A[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(new int[]{1,2,3,4,5}));
        System.out.println(solve(new int[]{9,9,4,2}));

        System.out.println(solve(new int[]{2,3,4,1,2,3,4,5}));

        System.out.println(solve(new int[]{1,2,3,1,10}));

        System.out.println(solve(new int[]{9,2,4,2}));

        
    }
}

