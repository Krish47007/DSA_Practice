package arrays.intermediate.day_11_carry_forward.assignment;

public class Special_Subsequences_AG {

    public int solve(String str) {

        //We have to see for each A how many times G has occurred on the right
        //So we come from right to left and store count of G. Whenever we see an A, we add g's count to
        //the answer.

        int gCount = 0, ans = 0;
        int modVal = 1000000007;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'G')
                gCount++;
            else if (str.charAt(i) == 'A') {
                ans = (ans + gCount) % modVal;
            }
        }

        return ans;
    }

    public int solve_2(String str) {

        //Traversing from right to left

        int aCount = 0, ans = 0;
        int modVal = 1000000007;
        for (int i = 0;i<str.length();i++) {
            if (str.charAt(i) == 'A')
                aCount++;
            else if (str.charAt(i) == 'G') {
                ans = (ans + aCount) % modVal;
            }
        }

        return ans;
    }
}
