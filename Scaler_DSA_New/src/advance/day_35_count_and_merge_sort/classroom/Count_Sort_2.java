package advance.day_35_count_and_merge_sort.classroom;

public class Count_Sort_2 {

    // A[i] can be +ve or -ve
    public static int[] countSort(int[] A)
    {
        int min = A[0],max = A[0];
        for (int i = 1;i<A.length;i++)
        {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        int[] freq = new int[max - min + 1];

        for (int i = 0;i<A.length;i++)
        {
            freq[A[i] - min]++;
        }
        int k = 0;
        for (int i = 0;i< freq.length;i++)
        {
            while (freq[i] != 0)
            {
                A[k] = i + min;
                freq[i]--;
                k++;
            }
        }
        return A;
    }

    public static void main(String[] args) {

        for (int x : countSort(new int[]{2,1,2,-3,1,0}))
            System.out.print(x+" ");
        System.out.println();
        for (int x : countSort(new int[]{1,7,2,3,7,1}))
            System.out.print(x+" ");
    }
}
