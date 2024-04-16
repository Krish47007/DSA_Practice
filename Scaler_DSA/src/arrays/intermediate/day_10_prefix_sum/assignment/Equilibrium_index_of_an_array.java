package arrays.intermediate.day_10_prefix_sum.assignment;

public class Equilibrium_index_of_an_array {

    public int solve(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            int ls = (i == 0) ? 0 : arr[i - 1];
            int rs = arr[arr.length - 1] - arr[i];
            if (ls == rs) {
                index = i;
                break;
            }
        }
        return index;
    }
}
