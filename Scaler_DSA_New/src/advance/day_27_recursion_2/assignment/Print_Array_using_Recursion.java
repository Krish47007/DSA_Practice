package advance.day_27_recursion_2.assignment;

public class Print_Array_using_Recursion {

    public static void PrintArray(int[] A) {

        print(A,0);
        System.out.println();
    }

    private static void print(int[] arr,int idx)
    {
        if(idx < arr.length)
        {
            System.out.print(arr[idx]+" ");
            print(arr,idx + 1);
        }
    }

    public static void main(String[] args) {

        PrintArray(new int[]{5,1,4,2,3});

    }
}
