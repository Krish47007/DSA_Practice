package arrays.advanced.oneD;

/*
 * Given an integer array A find the max value of f[i,j] where
 *   f[i,j] = A[i] - A[j] for any index i,j
 * */
public class MaxDifferenceInArray {

    public int getMaxDifference(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Difference can't be calculated!!!");

        int maxVal = arr[0], minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            minVal = Math.min(minVal, arr[i]);
        }
        return maxVal - minVal;
    }

    public static void main(String[] args) {

        var obj = new MaxDifferenceInArray();
        System.out.println(obj.getMaxDifference(new int[]{1, 3, -2}));
    }
}
