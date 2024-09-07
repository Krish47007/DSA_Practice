package advance.day_42_stacks_1.assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Balanced_Paranthesis {

    private static Map<Character,Character> buildCharacterMap()
    {
        Map<Character,Character> charMap = new HashMap<>();
        charMap.put(')','(');
        charMap.put('}','{');
        charMap.put(']','[');

        return charMap;
    }

    public static int solve(String A) {

        Map<Character,Character> charMap = buildCharacterMap();
        Stack<Character> stack = new Stack<>();

        for (char ch : A.toCharArray())
        {
            //meaning opening brace
            if(charMap.get(ch) == null)
                stack.push(ch);
            else
            {
                //string starts with closed braces
                if(stack.isEmpty())
                    return 0;
                char topMostChar = stack.pop();
                if(topMostChar != charMap.get(ch))
                    return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;

    }

    public static void main(String[] args) {

        System.out.println(solve("{([])}"));
    }
}
