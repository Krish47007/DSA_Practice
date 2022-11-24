package arrays;

public class Replace_Elements_with_Greatest_Element_on_Left_Side {

    public static int[] replaceElements(int[] arr) {

         int max = arr[0];
         int i = 1;

         while (i<arr.length)
         {
             int t = arr[i];
             arr[i] = max;
             max = Math.max(max,t);
             i++;
         }
         arr[0] = -1;

        return arr;
    }

    public static void main(String[] args) {

        for (int x : replaceElements(new int[]{5,2,3,18,24,6}))
            System.out.print(x + " ");
    }
}
