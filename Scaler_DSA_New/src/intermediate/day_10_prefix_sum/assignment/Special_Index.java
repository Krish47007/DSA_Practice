package intermediate.day_10_prefix_sum.assignment;

public class Special_Index {

    private int[] buildPrefixArray(int[] arr,boolean isEvenPref)
    {
        int[] pf = new int[arr.length];
        if(isEvenPref)
            pf[0] = arr[0];
        else
            pf[0] = 0; //not needed but for readability

        for (int i = 1;i<arr.length;i++)
        {
            if(isEvenPref)
            {
                pf[i] = pf[i-1] + ((i % 2 == 0) ? arr[i] : 0);
            }
            else
                pf[i] = pf[i-1] + ((i % 2 != 0) ? arr[i] : 0);
        }
        return pf;
    }
    public int solve(int[] A) {

        int[] evenPf = buildPrefixArray(A,true);
        int[] oddPf = buildPrefixArray(A,false);
        int specialIdxCount = 0;

        for (int i = 0;i<A.length;i++)
        {
            int sumOfOddIndicesElem = 0,sumOfEvenIndicesElem = 0;
            if( i == 0)
            {
                sumOfOddIndicesElem = evenPf[A.length - 1] - evenPf[0];
                sumOfEvenIndicesElem = oddPf[A.length - 1] - oddPf[0];
            }
            else
            {
                sumOfEvenIndicesElem = evenPf[i-1] + oddPf[A.length-1] - oddPf[i];
                sumOfOddIndicesElem = oddPf[i-1] + evenPf[A.length-1] - evenPf[i];
            }

            if(sumOfEvenIndicesElem == sumOfOddIndicesElem)
                specialIdxCount++;
        }

        return specialIdxCount;

    }
}
