package arrays.intermediate;

public class Special_Index {

    private int[] calEvenPrefixArray(int[] a) {

        int[] prefix = new int[a.length];
        prefix[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 0)
                prefix[i] = prefix[i - 1] + a[i];
            else
                prefix[i] = prefix[i - 1];
        }
        return prefix;
    }

    private int[] calOddPrefixArray(int[] a) {

        int[] prefix = new int[a.length];
        prefix[0] = 0;

        for (int i = 1; i < a.length; i++) {
            if (i % 2 != 0)
                prefix[i] = prefix[i - 1] + a[i];
            else
                prefix[i] = prefix[i - 1];
        }
        return prefix;
    }

    public int solve(int[] A) {

        //Construct Even prefix array
        int[] evenPrefix = calEvenPrefixArray(A);
        int[] oddPrefix = calOddPrefixArray(A);
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int evenLS = (i == 0) ? 0 : evenPrefix[i - 1];
            int oddLS = (i == 0) ? 0 : oddPrefix[i - 1];

            int evenIndexedSum = evenLS + oddPrefix[A.length - 1] - oddPrefix[i];
            int oddIndexedSum = oddLS + evenPrefix[A.length - 1] - evenPrefix[i];

            if (evenIndexedSum == oddIndexedSum) {
                //System.out.println(i);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        var obj = new Special_Index();
        System.out.println(obj.solve(new int[]{2, 1, 6, 4}));
        System.out.println(obj.solve(new int[]{1, 1, 1}));
    }


}
