package sorting;

public class InsertionSort {

    /*
    * Its like arranging cards in hand.
    * We assume whatever card we have in our hand is in its correct pos so when we pick the next card
    * we rearrange that.*/
    static void insertionSort(int[] arr)
    {
        for(int i = 1;i<arr.length;i++)
        {
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }
    }

    public static void main(String[] args) {

        int[] arr = { 5,1,1,2,2,0,0};

        insertionSort(arr);

        for (int x: arr)
            System.out.print(x+" ");
    }
}
