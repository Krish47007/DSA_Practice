package advance.day_52_two_pointers.classroom;

public class Pair_Difference {

    /*
        Given a sorted array check if there exists a pair where arr[j] - arr[i] == k where k > 0
     */
    public static boolean checkPairDiffExists(int[] arr,int k)
    {
        int n = arr.length, i = 0, j = 1;

        while (j < n)
        {
            int diff = arr[j] - arr[i];

            if (diff == k)
                return true;
            else if (diff < k)
                j++;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {-5, -2, 1, 8, 10, 12, 15};
        int k = 11;

        System.out.println(checkPairDiffExists(arr,k));
    }
}
