package advance.day_27_recursion_2.assignment;

public class Max_of_an_Array_Using_Recursion {

    private static int findMax(int[] arr,int idx,int max)
    {
        if (idx >= arr.length)
            return max;
        if(arr[idx] > max)
            return findMax(arr,idx+1,arr[idx]);
        else
            return findMax(arr,idx+1,max);
    }

    public static int getMax(int[] A) {

        return findMax(A,0,A[0]);
    }

    public static void main(String[] args) {

        System.out.println(getMax(new int[]{5,14,1,53,7}));
    }
}
