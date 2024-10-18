package advance.day_52_two_pointers.classroom;

public class Two_Sum_Using_2_Pointers {

    /*
            Given a sorted array check if there exists a pair a[i] + a[j] = k where i != j
     */

    public static boolean checkIfPairExists(int[] arr,int k)
    {
        int n = arr.length;
        int i = 0, j = n-1;

        while (i < j)
        {
            if (arr[i] + arr[j] == k)
                return true;
            //decrease sum
            else if (arr[i] + arr[j] > k)
                j--;
            //increase the sum
            else
                i++;

        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {-5, -2, 1, 8, 10, 12, 15};
        int k = 10;
        System.out.println(checkIfPairExists(arr,k));
        k = 17;
        System.out.println(checkIfPairExists(arr,k));

    }
}
