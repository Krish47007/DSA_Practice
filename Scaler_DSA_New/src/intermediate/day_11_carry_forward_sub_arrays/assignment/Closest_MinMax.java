package intermediate.day_11_carry_forward_sub_arrays.assignment;

public class Closest_MinMax {

    public int solve(int[] A) {

        int minElem = A[0],maxElem = A[0];

        for (int i = 1;i<A.length;i++)
        {
            minElem = Math.min(minElem,A[i]);
            maxElem = Math.max(maxElem,A[i]);
        }

        //if all array elements are same like [8,8,8,,8]
        if(minElem == maxElem)
            return 1;

        //In worst case the entire array could be teh array containing minElem and max elem
        int ans = A.length;
        int minIdx = -1,maxIdx = -1;

        for (int i = 0;i<A.length;i++)
        {
            if(A[i] == maxElem)
            {
                maxIdx = i;
                if(minIdx != -1) //have already seen minElem
                    ans = Math.min(ans,(maxIdx - minIdx) + 1);

            }
            else if(A[i] == minElem)
            {
                minIdx = i;
                if(maxIdx != -1) //have already seen maxElem
                    ans = Math.min(ans,(minIdx - maxIdx) + 1);
            }
        }
        return ans;
    }
}
