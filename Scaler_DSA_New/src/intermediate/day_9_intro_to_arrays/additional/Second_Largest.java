package intermediate.day_9_intro_to_arrays.additional;

public class Second_Largest {

    public int solve(int[] arr) {

        int max = -1,secondMax = -1;

        for (int i = 0;i< arr.length;i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }else if( arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
