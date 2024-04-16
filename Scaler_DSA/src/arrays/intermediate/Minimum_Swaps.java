package arrays.intermediate;

public class Minimum_Swaps {

    public int solve(int[] A, int B) {

        //First we check how many elements exist in the array
        //which are less than or equal to B
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B)
                k++;
        }

        //If there's no element <= B or only 1 element (which is already placed together with itself
        if (k == 0 || k == 1)
            return 0;

        //Calculate the no. of bad elements in 1st window k
        int bad = 0;
        for (int i = 0; i < k; i++) {
            if (A[i] > B)
                bad++;
        }

        //In worst case bad is ans
        int ans = bad;

        //Now k is our window size as our goal is to put k elements together
        // which are less than or equal to B
        int s = 1, e = k;

        while (e < A.length) {
            if (A[s - 1] > B)
                bad--;
            if (A[e] > B)
                bad++;
            ans = Math.min(ans, bad);
            s++;
            e++;
        }

        return ans;
    }
}
