package intermediate.day_9_intro_to_arrays.assignment;

public class Array_Rotation {

    private void swap(int[] A,int i,int j )
    {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    public int[] reverseInRange(int[] A, int B, int C) {

        while (B < C)
        {
            swap(A,B,C);
            B++;
            C--;
        }
        return A;
    }

    public int[] solve(int[] arr, int k) {

        int n = arr.length;
        k = k % n;
        reverseInRange(arr,0,n-1);
        reverseInRange(arr,0,k-1);
        reverseInRange(arr,k,n-1);
        return arr;
    }

    public static void main(String[] args) {

        for (int x : new Array_Rotation().solve(new int[]{1,2,3,4},2))
            System.out.print(x + " ");
    }
}
