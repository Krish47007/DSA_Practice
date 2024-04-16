package string;

import java.util.Arrays;
import java.util.Collections;

public class Check_anagrams {
/*
    public static int solve(String A, String B) {

        if( A.length() != B.length())
            return 0;
       char[] str1 = A.toCharArray();
       char[] str2 = B.toCharArray();
       Arrays.sort(str1);
       Arrays.sort(str2);

       for (int i = 0;i<str1.length;i++)
       {
           if(str1[i] != str2[i])
               return 0;
       }
       return 1;

    }*/

    /*
     *
     * */

    public static int solve(String A, String B) {

        if (A.length() != B.length())
            return 0;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z')
                freq1[A.charAt(i) - 'a']++;
        }
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) >= 'a' && B.charAt(i) <= 'z')
                freq2[B.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i])
                return 0;
        }

        return 1;

    }

    public static void main(String[] args) {

        System.out.println(solve("cat", "bat"));
        System.out.println(solve("secure", "rescue"));
    }
}
