package arrays.advanced.oneD;

/*
 * Given an integer array A find the max value of f[i,j] where
 *   f[i,j] = | A[i] - A[j] | + | i - j |  for any index i,j
 */

public class MaxDifferenceInArray_2 {

    public int getMaxDifference(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Difference can't be calculated!!!");

        int Xmax = arr[0], Xmin = arr[0], Ymax = arr[0], Ymin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            Xmax = Math.max(Xmax, arr[i] + i);
            Xmin = Math.min(Xmin, arr[i] + i);

            Ymax = Math.max(Ymax, arr[i] - i);
            Ymin = Math.min(Ymin, arr[i] - i);
        }
        return Math.max(Xmax - Xmin, Ymax - Ymin);
    }

    public static void main(String[] args) {

        var obj = new MaxDifferenceInArray_2();
        System.out.println(obj.getMaxDifference(new int[]{1, 3, -2}));
    }
}
