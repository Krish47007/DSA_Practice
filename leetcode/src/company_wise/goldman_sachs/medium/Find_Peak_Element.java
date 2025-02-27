package company_wise.goldman_sachs.medium;

public class Find_Peak_Element {

    /*public static int findPeakElement(int[] nums) {

        int index = 0;
        int n = nums.length;
        if (n == 1)
            return index;

        for (int i = 0;i < n;i++)
        {
            if ( i == 0 ) {
                if ( nums[i] > nums[i+1])
                    return i;
            }
            else if (i == n-1 ) {
                if ( nums[i] > nums[i-1])
                    return i;
            }
            else if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
                return i;


        }
        return  -1;
    }*/

    public static int findPeakElement(int[] nums) {

        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right)
        {
            int mid = left + (right - left)/2;

            //If left neighbour is > than mid element
            if (mid != 0 && nums[mid] < nums[mid - 1])
                right  = mid - 1;

            //Right neighbour is > than mid
            else if(mid != n-1 && nums[mid] < nums[mid + 1])
                left = mid + 1;

            //we have found the element regardless of border or not ( {5,4,3,2,1} or { 1,2,3,4,5} or { 1,2,3,1}
            else
                return mid;


        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1,2,3,1}));
        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
        System.out.println(findPeakElement(new int[]{1,2,3,4,5}));
    }
}
