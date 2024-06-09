package intermediate.day_11_carry_forward_sub_arrays.assignment;

public class Generate_all_SubArrays {

    public static int[][] solve(int[] A) {

        int n = A.length;
        //total no. of sub arrays for array of size n
        int[][] allSubArrays = new int[ n * ( n + 1)/2][];
        int idx = 0;

        for (int i = 0;i<n;i++)
        {
            for (int j = i;j<n;j++)
            {
                allSubArrays[idx] = new int[ j - i + 1 ];
                int k_idx = 0;
                for (int k = i;k<=j;k++)
                    allSubArrays[idx][k_idx++] = A[k];
                idx++;
            }
        }
        return allSubArrays;
    }

    public static void main(String[] args) {

        int[][] subArrays = solve(new int[]{1,2,3,4,5});

        for (int i = 0;i<subArrays.length;i++)
        {
            for (int j = 0;j<subArrays[i].length;j++)
                System.out.print(subArrays[i][j]+" ");
            System.out.println();
        }
    }
}
