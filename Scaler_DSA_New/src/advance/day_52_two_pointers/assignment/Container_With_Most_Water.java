package advance.day_52_two_pointers.assignment;

public class Container_With_Most_Water {

    public int maxArea(int[] A) {

        int n = A.length;
        int i = 0, j = n - 1;
        int maxArea = 0;

        while ( i < j)
        {
            int area = ( j - i) * Math.min(A[i],A[j]);
            maxArea = Math.max(area,maxArea);

            if( A[i] < A[j])
                i++;
            else if(A[i] > A[j])
                j--;
            else
            {
                i++;
                j--;
            }
        }
        return maxArea;
    }
}
