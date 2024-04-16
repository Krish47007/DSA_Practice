package arrays;

public class ReverseCharArray {

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'd'};
        int beg = 0;
        int end = arr.length - 1;

        while (beg < end) {
            char t = arr[beg];
            arr[beg] = arr[end];
            arr[end] = t;
            beg++;
            end--;
        }

        for (char c : arr)
            System.out.print(c + " ");

    }
}