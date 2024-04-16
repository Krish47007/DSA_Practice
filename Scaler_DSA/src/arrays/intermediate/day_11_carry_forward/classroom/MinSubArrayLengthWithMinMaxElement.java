package arrays.intermediate.day_11_carry_forward.classroom;

public class MinSubArrayLengthWithMinMaxElement {

    public static int getClosestMinMax(int[] arr) {

        int min = arr[0],max = arr[0];
        int n = arr.length;
        for (int i = 1;i<n;i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        if(min == max)
            return 1;

        int min_i = -1, max_i = -1;
        int ans = n; //worst case entire array is sub-array so length is n.
        for (int i = n-1;i>=0;i--)
        {
            if(arr[i] == min)
            {
                min_i = i;
                if(max_i != -1)
                    ans = Math.min(ans,max_i - min_i + 1);

            }
            else if(arr[i] == max)
            {
                max_i = i;
                if(min_i != -1)
                    ans = Math.min(ans,min_i - max_i + 1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int[] A = {1,6,4,6,5,1,5,2,6,4,4,2,1,5};
        System.out.println(getClosestMinMax(A));
    }
}
