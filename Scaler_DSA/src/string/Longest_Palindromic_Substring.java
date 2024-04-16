package string;

public class Longest_Palindromic_Substring {

    //Watch class lecture and solution from problem section
    int[] expand(String s, int p1, int p2) {
        while (p1 >= 0 && p2 < s.length() && s.charAt(p1) == s.charAt(p2)) {
            p1--;
            p2++;
        }

        return new int[]{p2 - p1 - 1, p1 + 1, p2 - 1};
    }

    public String longestPalindrome(String A) {

        //A single character string is always palindrome
        int ans[] = {0, 0};
        int max = 1;
        //for odd length palindrome like "aba"
        for (int i = 0; i < A.length(); i++) {
            int[] temp = expand(A, i, i);
            if (temp[0] > max) {
                ans[0] = temp[1];
                ans[1] = temp[2];
                max = temp[0];
            }
        }
        //For even length palindrome like "abba"
        for (int i = 0; i < A.length() - 1; i++) {
            int[] temp = expand(A, i, i + 1);
            if (temp[0] > max) {
                ans[0] = temp[1];
                ans[1] = temp[2];
                max = temp[0];
            }
        }

        return A.substring(ans[0], ans[1] + 1);
    }

    public static void main(String[] args) {

        var obj = new Longest_Palindromic_Substring();
        System.out.println(obj.longestPalindrome("aaaabaaa"));
        System.out.println(obj.longestPalindrome("abba"));
        System.out.println(obj.longestPalindrome("cabbadebbe"));
        System.out.println(obj.longestPalindrome("cabbadebbeMADAM"));
        System.out.println(obj.longestPalindrome("abcd"));
        System.out.println(obj.longestPalindrome("abbd"));
        System.out.println(obj.longestPalindrome("abbddd"));
    }
}
