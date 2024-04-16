package arrays.intermediate.day_12_sub_arrays.classroom;

public class AllSubArraySumAtIndex {

    public static int getAllSubArraySumAtIndex(int[] arr,int index)
    {
        int sum = 0;

        for (int i = index;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(getAllSubArraySumAtIndex(new int[]{3,8,4,7,9,4,3,2,10,6},3));
    }
}
