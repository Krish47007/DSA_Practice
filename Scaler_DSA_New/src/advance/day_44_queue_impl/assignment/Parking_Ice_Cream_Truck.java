package advance.day_44_queue_impl.assignment;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *  This problem is an implementation of sliding window maximum problem
 */
public class Parking_Ice_Cream_Truck {

    public int[] slidingMaximum(final int[] A, int B) {

        int n = A.length;
        if( B > n)
        {
            int maxElem = A[0];
            for (int i = 1;i<n;i++)
            {
                maxElem = Math.max(maxElem,A[i]);
            }
            return new int[]{maxElem};
        }

        int[] ans = new int[n-B+1];
        int idx = 0;

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(A[0]);
        //1st window of size B
        for (int i = 1;i<B;i++)
        {
            while (!dq.isEmpty() && A[i] > dq.peekLast())
                dq.pollLast();
            dq.addLast(A[i]);

        }
        ans[idx++] = dq.peekFirst();

        //Handle for subsequent window of size B
        int s = 1,e = B;

        while (e < n)
        {
            //If front of queue has element from last window then remove it.
            if(!dq.isEmpty() && A[s-1] == dq.peekFirst())
                dq.pollFirst();

            while (!dq.isEmpty() && A[e] > dq.peekLast())
                dq.pollLast();

            dq.addLast(A[e]);
            ans[idx++] = dq.peekFirst();
            s++;
            e++;
        }
        return ans;
    }
}
