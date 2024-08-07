package advance.day_35_count_and_merge_sort.assignment;

public class Count_Sort {

    public static int[] solve(int[] A) {

        int max = A[0];

        for (int i = 1;i<A.length;i++)
        {
            max = Math.max(max,A[i]);
        }
        int[] freq = new int[max + 1];

        for (int i = 0;i<A.length;i++)
        {
            freq[A[i]]++;
        }

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

        int[] A = { 1,4,5,6,1,4,5,2,100000};
        for (int x : solve(A))
            System.out.print(x+" ");
    }
}
