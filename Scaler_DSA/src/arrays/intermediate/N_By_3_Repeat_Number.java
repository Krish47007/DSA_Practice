package arrays.intermediate;

public class N_By_3_Repeat_Number {

    private int countFreq(int[] a, int target) {
        int freq = 0;
        for (int x : a) {
            if (x == target)
                freq++;
        }
        return freq;
    }

    public int repeatedNumber(int[] A) {

        //With N/3 freq there can be at most 2 majority elements present.
        int[] me = {-1, -1};
        int[] count = new int[2];


        for (int i = 0; i < A.length; i++) {
            int curr = A[i];
            if (curr == me[0])
                count[0]++;
            else if (curr == me[1])
                count[1]++;
            else if (count[0] == 0) {
                me[0] = curr;
                count[0] = 1;
            } else if (count[1] == 0) {
                me[1] = curr;
                count[1] = 1;
            } else {
                count[0]--;
                count[1]--;
            }
        }

        int freq1 = countFreq(A, me[0]);
        int freq2 = countFreq(A, me[1]);
        int res = -1;

        if (freq1 > A.length / 3)
            res = me[0];
        else if (freq2 > A.length / 3)
            res = me[1];

        return res;

    }

    public static void main(String[] args) {
        var obj = new N_By_3_Repeat_Number();
        System.out.println(obj.repeatedNumber(new int[]{1, 2, 3, 1, 1}));
        System.out.println(obj.repeatedNumber(new int[]{1, 2, 3}));
        System.out.println(obj.repeatedNumber(new int[]{1, 2, 2, 1, 1, 2, 1, 2, 5}));
        System.out.println(obj.repeatedNumber(new int[]{1000441, 1000441, 1000994}));
    }
}

