package searching;

public class LinearSearch {

    int linSearch(int[] arr,int key)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
}
