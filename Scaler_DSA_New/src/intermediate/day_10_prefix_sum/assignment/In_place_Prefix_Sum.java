package intermediate.day_10_prefix_sum.assignment;

public class In_place_Prefix_Sum {

    public int[] solve(int[] A) {

        for (int i = 1;i<A.length;i++)
            A[i] = A[i-1] + A[i];

        return A;
    }
}
