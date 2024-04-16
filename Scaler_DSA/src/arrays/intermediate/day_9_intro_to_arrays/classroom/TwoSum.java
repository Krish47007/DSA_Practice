package arrays.intermediate.day_9_intro_to_arrays.classroom;

public class TwoSum {

    /*
    * Given an array of N elements return true if there exists a pair(i,j) such that
    *  arr[i] + arr[j] = k and i != j
    */

    // This is without using any extra space
    public static boolean checkTwoSum(int[] arr,int k)
    {
        /*
        * The problem with this approach is that we are checking the same pair twice i,e
        * arr[i][j] is again checked when its arr[j][i].
        * element at index say i is compared with at element at index j and again the same pair is checked again.*/
        for (int i = 0;i<arr.length;i++)
        {
            for (int j = 0;j < arr.length;j++)
            {
                if( i != j && (arr[i] + arr[j] == k))
                    return true;
            }
        }
        return false;
    }


    // This is without using any extra space
    public static boolean checkTwoSumOptimised(int[] arr,int k)
    {
        //The same pair should not be checked again so we always make sure that j starts from i+1.
        // We can either check the upper triangular or lower triangular matrix and its sufficient.
        for (int i = 0;i<arr.length;i++)
        {
            for (int j = i+1;j < arr.length;j++)
            {
                if( (arr[i] + arr[j] == k))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkTwoSum(new int[]{3,-2,1,4,3,6,8},10));
        System.out.println(checkTwoSum(new int[]{3,5,2,7,3},6));
        System.out.println(checkTwoSum(new int[]{2,4,-3,7},8));

        System.out.println("------------------");
        System.out.println(checkTwoSumOptimised(new int[]{3,-2,1,4,3,6,8},10));
        System.out.println(checkTwoSumOptimised(new int[]{3,5,2,7,3},6));
        System.out.println(checkTwoSumOptimised(new int[]{2,4,-3,7},8));
    }
}
