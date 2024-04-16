package demo;

public class ElementGreater {

    //Do it in 1 loop
    int getCount(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
            max = Math.max(arr[i], max);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                count++;
        }

        return arr.length - count;
    }


}
