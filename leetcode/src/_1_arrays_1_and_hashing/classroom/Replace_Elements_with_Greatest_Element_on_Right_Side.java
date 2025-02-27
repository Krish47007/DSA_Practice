package _1_arrays_1_and_hashing.classroom;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {

    public static int[] replaceElements(int[] arr) {

        int n = arr.length;
        int maxElem = arr[n-1];
        arr[n-1] = -1;

        for (int i = n-2;i>=0;i--)
        {
            int temp = arr[i];
            arr[i] = maxElem;
            maxElem = Math.max(maxElem,temp);
        }

        return arr;
    }

    public static void main(String[] args) {

        for (int x : replaceElements(new int[]{17,18,5,4,6,1}))
            System.out.print(x + " ");
    }
}
