package intermediate.day_11_carry_forward_sub_arrays.assignment;

public class Special_Subsequences_AG {

    public int solve(String s) {

        int gCount = 0;
        int ans = 0;
        int modVal = 1000000007;
        for (int i = s.length() - 1;i>=0;i--)
        {
            if(s.charAt(i) == 'G')
                gCount++;
            else if(s.charAt(i) == 'A')
                ans += gCount % modVal;
        }
        return ans;
    }

}
