package arrays.intermediate.day_9_intro_to_arrays.assignment;

public class Count_of_elements {

    /*
     *  If we find the maximum element from the array and count of it(maxFreq) and then if we subtract the
     *  maxFreq from length of the array then that's the count of elements which have at least 1 element > than itself
     *  [2,3,1,5,1,6,9,2,9]
     *   maxElem = 9, maxFreq = 2
     *   count  = 9 -2 = 7
     * */

    public int solve(int[] arr) {

        int maxElem = arr[0], maxFreq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
                maxFreq = 1;
            } else if (arr[i] == maxElem)
                maxFreq++;
        }

        return arr.length - maxFreq;
    }
}
