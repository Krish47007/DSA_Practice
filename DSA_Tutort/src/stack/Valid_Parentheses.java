package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {

    private static Map<Character, Character> map;

    static {
        map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                stk.push(s.charAt(i));
            else if (map.containsKey(s.charAt(i)) && !stk.isEmpty() && stk.peek() == map.get(s.charAt(i)))
                stk.pop();
            else
                return false;

        }

        return stk.isEmpty();

    }
}
