package advance.day_27_recursion_2.assignment;

public class Check_Palindrome_using_Recursion {

    private static int isPalindrome(String str,int beg,int end)
    {
        if( beg > end)
            return 1;
        if(str.charAt(beg) != str.charAt(end))
            return 0;
        return isPalindrome(str,beg + 1, end - 1);

    }
    public static int solve(String A) {

        return isPalindrome(A,0,A.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(solve("abdbba"));
    }
}
