package advance.day_20_1D_Array.assignment;

public class Continuous_Sum_Query {

    public static int[] solve(int A, int[][] B) {

        int[] ans = new int[A];

        for (int i = 0;i<B.length;i++)
        {
            int l = B[i][0] - 1, r = B[i][1] - 1, p = B[i][2];
            ans[l] += p;
            if(r < ans.length-1)
                ans[r+1] -= p;
        }

        for (int i = 1;i<ans.length;i++)
        {
            ans[i] = ans[i-1] + ans[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] B = { {1, 2, 10},
                      {2, 3, 20},
                      {2, 5, 25}
        };
        int A = 5;

        for (int x : solve(A,B))
            System.out.print(x + " ");
    }
}
