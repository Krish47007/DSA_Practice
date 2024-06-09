package intermediate.day_9_intro_to_arrays.additional;

public class Count_of_elements {

    public int solve(int[] arr) {

        int maxElem = arr[0],maxCount = 1;

        for (int i = 1;i< arr.length;i++)
        {
            if (arr[i] == maxElem)
                maxCount++;
            else if(arr[i] > maxElem)
            {
                maxElem = arr[i];
                maxCount = 1;
            }
        }
        return arr.length - maxCount;
    }
}
