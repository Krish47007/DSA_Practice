package arrays;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {

    public int[] replaceElements(int[] arr) {

        int max = arr[arr.length - 1];
        int i = arr.length - 2;

        while (i>=0)
        {
            int t = arr[i];
            arr[i] = max;
            max = Math.max(max,t);
        }

        arr[arr.length - 1] = -1;

        return arr;

    }
}
