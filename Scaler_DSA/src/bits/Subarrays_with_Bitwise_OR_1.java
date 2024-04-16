package bits;

public class Subarrays_with_Bitwise_OR_1 {

    public long solve(int A, int[] B) {

        long count = 0;
        boolean flag = false;
        //If all 0s
        for (int i = 0; i < A; i++) {
            if (B[i] == 1) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return count;

        long bitSum = 0;
        for (int i = 0; i < B.length; i++) {
            bitSum |= B[i];
            if (bitSum != 0)
                bitSum = 0;
            else
                count++;
        }

        int totalSubArrays = A * (A + 1) / 2;
        return totalSubArrays - count;
    }

    public static void main(String[] args) {

        var obj = new Subarrays_with_Bitwise_OR_1();
        // System.out.println(obj.solve(3,new int[]{1,0,1}));
        System.out.println(obj.solve(2, new int[]{1, 0}));
    }
}
