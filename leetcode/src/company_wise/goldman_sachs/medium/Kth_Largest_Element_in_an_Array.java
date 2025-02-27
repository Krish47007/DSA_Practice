package company_wise.goldman_sachs.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int x : nums)
            pq.add(x);

        int ans = Integer.MIN_VALUE;

        while ( k-- > 0)
            ans = pq.remove();

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));

        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
