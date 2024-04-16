package primer;


public class Balance_Array {

    //My solution - working but TC >>high

/*    private boolean isBalanced(List<Integer> list)
    {
        int evenSum = 0,oddSum = 0;

        for(int i = 0;i<list.size();i++)
        {
            if(i%2 == 0)
                evenSum += list.get(i);
            else
                oddSum += list.get(i);
        }

        return evenSum == oddSum;
    }

    public int solve(ArrayList<Integer> list) {

        int num = -1,count = 0;

        for(int i = 0;i<list.size();i++)
        {
            num = list.remove(i);
            if(isBalanced(list))
                count++;
            list.add(i,num);
        }

        return count;
    }*/

    //Watch the video explanation under hints
    private int getCountOfSpecialElements(int[] a) {
        //Building prefix and suffix array
        int[] oddPrefix, evenPrefix, oddSuffix, evenSuffix;

        oddPrefix = new int[a.length];
        oddSuffix = new int[a.length];
        evenPrefix = new int[a.length];
        evenSuffix = new int[a.length];

        //Building prefix array
        int even = 0, odd = 0;
        for (int i = 0; i < a.length; i++) {
            evenPrefix[i] = even;
            oddPrefix[i] = odd;
            if (i % 2 == 0)
                even += a[i];
            else
                odd += a[i];

        }

        //Building suffix array
        even = odd = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            evenSuffix[i] = even;
            oddSuffix[i] = odd;
            if (i % 2 == 0)
                even += a[i];
            else
                odd += a[i];
        }

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (evenPrefix[i] + oddSuffix[i] == oddPrefix[i] + evenSuffix[i])
                count++;
        }

        return count;
    }

    public int solve(int[] A) {

        return getCountOfSpecialElements(A);
    }

    public static void main(String[] args) {

        var obj = new Balance_Array();
        System.out.println(obj.getCountOfSpecialElements(new int[]{2, 1, 6, 4}));
    }
}
