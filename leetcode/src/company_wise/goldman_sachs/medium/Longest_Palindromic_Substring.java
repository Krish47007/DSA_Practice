package company_wise.goldman_sachs.medium;

public class Longest_Palindromic_Substring {

    public static String longestPalindrome(String s) {

        //If its length 1
        if (s.length() <= 1)
            return s;

        String lps = "";

        //At least 2 chars in the string
        for (int i = 1;i<s.length();i++)
        {
            //For odd length palindrome
            int low = i, high = i;

            while (s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;

                if (low < 0 || high == s.length())
                    break;
            }
            //we need to take from low + 1 as low till high - 1 as now low and high doesn't match
            // substring excludes end index so it will tae till high - 1.
            String pali = s.substring(low + 1,high);

            if (pali.length() > lps.length())
                lps = pali;


            //For even length palindrome
            low = i - 1;
            high  = i;
            while (s.charAt(low) == s.charAt(high))
            {
                low--;
                high++;

                if (low < 0 || high == s.length())
                    break;
            }
            //we need to take from low + 1 as low till high - 1 as now low and high doesn't match
            // substring excludes end index so it will tae till high - 1.
             pali = s.substring(low + 1,high);

            if (pali.length() > lps.length())
                lps = pali;
        }

        return lps;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("ABRBADAADAB"));
    }
}
