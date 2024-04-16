package arrays.advanced.oneD;

public class SumQuery_2 {

    /*
     *   Given an array and Q queries like Q[k] = (i,j,X) add X to all values in array staring from index i to j.
     *
     */
    int[] getSum(int[] arr, int[][] q) {
        for (int i = 0; i < q.length; i++) {
            int j = q[i][0];
            int k = q[i][1];
            int val = q[i][2];
            arr[j] += val;

            if (k + 1 <= arr.length - 1)
                arr[k + 1] -= val;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        var obj = new SumQuery_2();
        int[][] q = new int[][]{{1, 3, 2}, {2, 5, 3}, {5, 6, -1}};


        for (int x : obj.getSum(new int[7], q))
            System.out.print(x + " ");
    }
}
