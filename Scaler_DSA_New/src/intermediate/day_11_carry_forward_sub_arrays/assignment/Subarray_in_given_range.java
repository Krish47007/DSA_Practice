package intermediate.day_11_carry_forward_sub_arrays.assignment;

public class Subarray_in_given_range {

    public int[] solve(int[] A, int B, int C) {

        int[] subArr = new int[C - B + 1];
        int idx = 0;
        for (int i = B;i<=C;i++)
            subArr[idx++] = A[i];

        return subArr;
    }
}
