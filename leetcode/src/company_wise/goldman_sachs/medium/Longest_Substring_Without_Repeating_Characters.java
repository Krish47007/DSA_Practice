package company_wise.goldman_sachs.medium;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String str) {

        if (str.length() <= 1)
            return str.length();

        int maxLen = -1;
        int s = 0, e = s;
        HashSet<Character> hs = new HashSet<>();
        String ans = "";

        while (e < str.length())
        {
            //If duplicate
            if (!hs.add(str.charAt(e)))
            {
                String temp = str.substring(s,e);
                if (temp.length() > maxLen)
                {
                    maxLen = temp.length();
                    ans = temp;

                }
                //check from next char
                s = s + 1;
                e = s;
                //reset window
                hs.clear();
            }
          else
              e++;
        }

        //If all are unique chars or after a duplicate char
        //remaining chars are unique.
        String temp = str.substring(s,e);
        if (temp.length() > maxLen)
        {
            maxLen = temp.length();
            ans = temp;
        }

        //System.out.println(ans);
        return maxLen;

    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstring("abcd"));
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
