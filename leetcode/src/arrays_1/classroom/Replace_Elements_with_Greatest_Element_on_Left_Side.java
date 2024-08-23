package arrays_1.classroom;

public class Replace_Elements_with_Greatest_Element_on_Left_Side {

    public static int[] replaceElements(int[] arr) {

        int n = arr.length;
        int max = -1;

        for (int i = 0;i<n;i++)
        {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
        }

        return arr;
    }

    public static void main(String[] args) {

        for (int x : replaceElements(new int[]{17,18,5,4,6,1}))
            System.out.print(x + " ");
    }
}
