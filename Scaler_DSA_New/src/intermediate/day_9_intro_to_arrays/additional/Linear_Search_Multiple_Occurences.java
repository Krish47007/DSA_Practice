package intermediate.day_9_intro_to_arrays.additional;

public class Linear_Search_Multiple_Occurences {

    public int solve(int[] arr, int key) {

        int count = 0;

        for (int x : arr)
        {
            if( x == key)
                count++;
        }
        return count;
    }
}
