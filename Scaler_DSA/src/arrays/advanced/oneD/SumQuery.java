package arrays.advanced.oneD;


/*
 *   Given an array and Q queries like Q[k] = (i,X) add X to all values in array staring from index i to end.
 *
 */
public class SumQuery {

    int[] getSum(int[] arr, int[][] q) {
        for (int i = 0; i < q.length; i++) {
            int idx = q[i][0];
            int val = q[i][1];
            arr[idx] += val;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {

        var obj = new SumQuery();
        int[][] q = new int[][]{{1, 3}, {4, 2}, {3, 1}};


        for (int x : obj.getSum(new int[7], q))
            System.out.print(x + " ");
    }
}
