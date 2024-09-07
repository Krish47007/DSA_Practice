package advance.day_42_stacks_1.assignment;

import java.util.Stack;

public class Double_Character_Trouble {

    public static String solve(String A) {

        Stack<Character> stack = new Stack<>();

        for (char ch : A.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty())
        {
            ans.insert(0,stack.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        System.out.println(solve("abccbc"));
        System.out.println(solve("ab"));
    }
}
