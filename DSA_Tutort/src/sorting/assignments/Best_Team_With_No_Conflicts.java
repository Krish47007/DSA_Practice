package sorting.assignments;

public class Best_Team_With_No_Conflicts {

    static void selectionSort(int[] arr,int[] ages)
    {
        //If we sort till n-1th pos then last pos is already sorted
        for(int i = 0;i< arr.length-1;i++)
        {
            //int min = arr[i];
            int maxIndex = i;

            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[j] > arr[maxIndex])
                {
                    maxIndex = j;
                }
            }

            //swap
            swap(arr, i, maxIndex);
            swap(ages,i,maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public int bestTeamScore(int[] scores, int[] ages) {

        selectionSort(scores,ages);
        return 0;

    }
    public static void main(String[] args) {

        int[] scores = { 1,2,3,5 };
        int[] ages = {8,9,10,1};

        selectionSort(scores,ages);

        for (int x: scores)
            System.out.print(x+" ");

        System.out.println();

        for (int x: ages)
            System.out.print(x+" ");
    }


}
