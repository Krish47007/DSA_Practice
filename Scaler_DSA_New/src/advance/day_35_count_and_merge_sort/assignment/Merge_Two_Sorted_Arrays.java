package advance.day_35_count_and_merge_sort.assignment;

public class Merge_Two_Sorted_Arrays {

    public static int[] solve(final int[] A, final int[] B) {

        int n = A.length,m = B.length;
        int[] C = new int[n + m];
        int i = 0,j = 0;
        int k = 0;
        while (i < n && j < m)
        {
            if(A[i] <= B[j])
            {
                C[k++] = A[i++];
            }
            else
                C[k++] = B[j++];
        }
        while (i < n)
        {
            C[k++] = A[i++];
        }
        while (j < m)
        {
            C[k++] = B[j++];
        }

        return C;

    }

    public static void main(String[] args) {

        int[] A = {4, 7, 9};
        int[] B = {2, 4,11, 19};
        for (int x : solve(A,B))
            System.out.print(x+" ");
    }
}
