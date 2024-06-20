package intermediate.day_17_strings.additional;

public class Amazing_Subarrays {

    private static boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static int solve(String str) {

        int count  = 0;
        int n = str.length();
        int modVal = 10003;
        for (int i = 0;i < n;i++)
        {
            if(isVowel(str.charAt(i)))
                count = (count + (n-i) ) % modVal; // n-1-i+1 is num of chars b/w i and n.
        }

        return count;
    }

    public static void main(String[] args) {

       // System.out.println(solve("ABEC"));
        System.out.println(solve("ABECDEFGHEIOAP"));
    }
}
