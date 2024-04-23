package arrays.intermediate.day_12_sub_arrays.assignment;

public class Generate_all_subarrays {

    public int[][] solve(int[] arr) {

        int n = arr.length;
        //No. of subarray possible is n*(n+1)/2
        int[][] subArrays = new int[n * (n + 1) / 2][];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //Creating a jagged array
                subArrays[idx] = new int[j - i + 1];
                int k_idx = 0;
                for (int k = i; k <= j; k++) {
                    subArrays[idx][k_idx++] = arr[k];
                }
                idx++;
            }
        }

        return subArrays;

    }
}
