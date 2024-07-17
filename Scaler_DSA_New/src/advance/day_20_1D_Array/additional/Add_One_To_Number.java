package advance.day_20_1D_Array.additional;

public class Add_One_To_Number {

    public static int[] plusOne(int[] A) {


        for (int i = A.length - 1;i>=0;i--)
        {
            if(A[i] == 9) {
                A[i] = 0;
                //carry = 1;
            }
            else {
                A[i] = A[i] + 1;
                break;

            }
        }

       for (int i = 0;i<A.length;i++)
       {
           if(A[i] != 0)
           {
               int n = A.length - i;
               int[] ans = new int[n];
               System.arraycopy(A,i,ans,0,A.length-i);
               return ans;
           }
       }

       int[] ans = new int[A.length + 1];
       ans[0] = 1;
       return ans;
    }

    public static void main(String[] args) {

        for (int x : plusOne(new int[]{1,2,3}))
            System.out.print(x + " ");
    }
}
