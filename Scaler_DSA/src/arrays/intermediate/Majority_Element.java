package arrays.intermediate;

public class Majority_Element {

    public int majorityElement(final int[] A) {

        int me = A[0], count = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == me)
                count++;
            else
                count--;
            if (count == 0) {
                me = A[i];
                count = 1;
            }
        }
        //me is a potential ME but may not be ME ex - [1,2,3,4,5]
        //Check for freq of ME
        int freq = 0;
        for (int x : A) {
            if (x == me)
                freq++;
        }

        if (freq > A.length / 2)
            return me;
        else return -1;
    }
}
