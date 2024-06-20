package intermediate.day_12_sliding_window_contribution_technique.classroom;

public class SubArrayOfLength_K {

    /*
    *   1st sub array [0,k-1]
    *   last sub array [n-k,n-1]
    *   #sub arrays = n-1-k+1+1 = n-k+1
    */
    public static int countSubArrOfLengthK(int[] arr,int k)
    {
        int n = arr.length;
        if(k > n)
            return 0;
        else
            return n-k+1;
    }

    public static void printIndicesOfSubArrayOfLength_K(int[] arr,int k)
    {
        int n = arr.length;
        if(k > n)
            return;

        for (int i = 0;i <= n-k;i++)
        {
            int l = i;
            int r = l + (k-1);
            System.out.println(l+" "+r);
        }
    }

    public static void main(String[] args) {

        System.out.println(countSubArrOfLengthK(new int[]{3,-2,4,-1,2,6},3));
        printIndicesOfSubArrayOfLength_K(new int[]{3,-2,4,-1,2,6},3);
    }
}
