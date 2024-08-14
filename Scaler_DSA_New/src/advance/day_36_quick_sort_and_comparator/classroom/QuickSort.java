package advance.day_36_quick_sort_and_comparator.classroom;

public class QuickSort {

    private void swap(int[] A,int i,int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    private int partition(int[] A,int start,int end)
    {
        int pivot = A[start];
        int i = start + 1, j = end;

        while (i <= j)
        {
            if(A[i] > pivot)
            {
                swap(A,i,j);
                j--;
            }
            else
                i++;
        }
        //swap pivot now and return its index
        swap(A,start,j);
        return j;
    }

    void quickSort(int[] A,int start,int end)
    {
        int pivotIndex = partition(A,start,end);
        quickSort(A,start,pivotIndex - 1);
        quickSort(A,pivotIndex + 1,end);

    }

    public static void main(String[] args) {

        var obj = new QuickSort();
        int[] arr = {4,1,3,2,5};
        obj.quickSort(arr,0,arr.length - 1);

        for (int x : arr)
            System.out.print(x);
    }
}
