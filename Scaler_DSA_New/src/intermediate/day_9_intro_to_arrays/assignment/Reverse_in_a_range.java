package intermediate.day_9_intro_to_arrays.assignment;

public class Reverse_in_a_range {

    private void swap(int[] A,int i,int j )
    {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    public int[] solve(int[] A, int B, int C) {

        while (B < C)
        {
            swap(A,B,C);
            B++;
            C--;
        }
        return A;
    }
}
