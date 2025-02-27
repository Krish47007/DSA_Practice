package company_wise.goldman_sachs.medium;

import java.util.Stack;

public class Backspace_String_Compare {

    public static boolean backspaceCompare(String s, String t)
    {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String s)
    {
        Stack<Character> stk = new Stack<>();

        for (int i = 0;i<s.length();i++)
        {
            if (s.charAt(i) != '#')
                stk.push(s.charAt(i));
            else if (!stk.isEmpty()) {
                stk.pop();
            }

        }

        return String.valueOf(stk);
    }

    /*public static boolean backspaceCompare(String s, String t) {

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();

        for (int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '#' && !stk1.isEmpty())
                stk1.pop();
            else if (s.charAt(i) != '#')
                stk1.push(s.charAt(i));
        }
        for (int i = 0;i<t.length();i++)
        {
            if(t.charAt(i) == '#' && !stk2.isEmpty())
                stk2.pop();
            else if (t.charAt(i) != '#')
                stk2.push(t.charAt(i));
        }


        while (!stk1.isEmpty() && !stk2.isEmpty())
        {
            if( stk1.pop() != stk2.pop())
            {
               return false;
            }
        }
        if (stk1.isEmpty() && stk2.isEmpty())
            return true;
        else
            return false;
    }
*/
    public static void main(String[] args) {

        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##","c#d#"));
        System.out.println(backspaceCompare("a#c","b"));
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }
}
