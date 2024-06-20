package intermediate.day_17_strings.assignment;

public class Longest_Palindromic_Substring {

    /*
    *   There can be palindromes with 1 middle element and with 2 middle elements
    *   We need to handle both the cases separately.
    * */
    public static String longestPalindrome(String s) {

        int lengthOfSubStr = 0;
        int n = s.length();
        int[] idx = new int[2];
        //For one middle element
        for (int i = 0;i<n;i++)
        {
            int l = i,r = i;

            while (l >= 0 && r < n && (s.charAt(l) == s.charAt(r)))
            {
                int len = r-l+1;
                if( len > lengthOfSubStr)
                {
                    lengthOfSubStr = r-l+1;
                    idx[0] = l;
                    idx[1] = r;
                }
                l--;
                r++;
            }
        }

        //For two middle elements
        for (int i = 0;i<n;i++)
        {
            int l = i,r = i+1;

            while (l >= 0 && r < n && (s.charAt(l) == s.charAt(r)))
            {
                int len = r-l+1;
                if( len > lengthOfSubStr)
                {
                    lengthOfSubStr = r-l+1;
                    idx[0] = l;
                    idx[1] = r;
                }
                l--;
                r++;
            }
        }

        return s.substring(idx[0],idx[1] + 1);
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("MADAM"));
        System.out.println(longestPalindrome("aaaabaaa"));
        System.out.println(longestPalindrome("abba"));
    }
}
