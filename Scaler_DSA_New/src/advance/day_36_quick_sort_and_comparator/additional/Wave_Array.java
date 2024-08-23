package advance.day_36_quick_sort_and_comparator.additional;

import java.util.Arrays;

public class Wave_Array {

    private void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] wave(int[] A) {

        Arrays.sort(A);

        for (int i = 1;i<A.length;i+=2)
        {
            swap(A,i,i-1);
        }
        return A;
    }

    public static void main(String[] args) {

        var obj = new Wave_Array();
        for (int x : obj.wave(new int[]{5,1,3,4,6,2}))
            System.out.print(x + " ");
    }
}
