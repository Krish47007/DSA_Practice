package recursion;

public class Check_Palindrome {

    public int solve(String A) {

        return isPalindrome(A.toCharArray(), 0, A.length() - 1);
    }

    private int isPalindrome(char[] str, int beg, int end) {

        if (beg > end)
            return 1;
        else if (str[beg] == str[end] && isPalindrome(str, beg + 1, end - 1) == 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        var obj = new Check_Palindrome();
        System.out.println(obj.solve("MADAM"));
        System.out.println(obj.solve("D"));
        System.out.println(obj.solve("ABA"));
        System.out.println(obj.solve("ABAA"));
    }
}
