package advance.day_35_count_and_merge_sort.classroom;

public class CountSort_1 {

    // 0<=A[i]<=9
    // smallest number that can be formed by rearranging the digits
    public static int[] countSort(int[] A)
    {
        int n = A.length;
        if(n == 0 || n == 1)
            return A;
        //create a freq array of size 10 as per question the range of numbers
        //range from 0-9
        int[] freq = new int[10];

        for (int i = 0;i<A.length;i++)
        {
            freq[A[i]]++;
        }

        //populate the values in the array
        int idx = 0;
        for (int i = 0;i<freq.length;i++)
        {
            while (freq[i] != 0)
            {
                A[idx] = i;
                freq[i]--;
                idx++;
            }
        }
        return A;
    }

    public static void main(String[] args) {

        for (int x : countSort(new int[]{9,1,2,5,4,2,1,2,5,8}))
            System.out.print(x);
    }
}
