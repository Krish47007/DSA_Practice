package intermediate.day_9_intro_to_arrays.additional;

public class Time_to_equality {

    public int solve(int[] arr) {

        int maxElem = arr[0],time = 0;

        for (int i = 1;i<arr.length;i++)
            maxElem = Math.max(maxElem,arr[i]);

        for (int x : arr)
            time += (maxElem - x);

        return time;
    }
}
