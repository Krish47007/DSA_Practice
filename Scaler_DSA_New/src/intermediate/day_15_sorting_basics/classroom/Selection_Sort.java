package intermediate.day_15_sorting_basics.classroom;

public class Selection_Sort {

    private static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] selectionSortAsc(int[] arr)
    {
        int n = arr.length;
        //If n-1 elements are sorted then last element
        // is also sorted
        for (int i = 0;i < n-1;i++)
        {
            int minElem = arr[i];
            int minIdx = i;

            for (int j = i+1;j < n;j++)
            {
                if(arr[j] < minElem)
                {
                    minElem = arr[j];
                    minIdx = j;
                }
            }
            //NOP if current element is the min element
            if(i != minIdx)
                swap(arr,i,minIdx);
        }
        return arr;
    }

    public static void main(String[] args) {

        //int[] arr = {5,4,7,6,1};
        //int[] arr = {5,4,3,2,1};
        int[] arr = {68,60,92,36,12,61,80,39,53,39,25,6,87,65,6,88,80,6,75,97,4,76,75,73,96,73,32,6,81,50,43,40,49,3,9,74,29,15,40};

        for(int x : selectionSortAsc(arr))
            System.out.print(x + " ");
    }
}
