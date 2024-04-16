package stack.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Decode_String {

    private Map<Character, Character> map;

    {
        map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        StringBuilder ans = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';

            } else if (c == '[') {
                //When we encounter [ - we need to add the previous string and count to stack
                strStack.push(ans);
                numStack.push(num);

                ans = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                //When we encounter this we need to append current string 'ans' 'count' times to the previously decoded string.
                StringBuilder temp = ans;
                ans = strStack.pop();
                int count = numStack.pop();

                while (count-- > 0)
                    ans.append(temp);
            } else {
                //If its a character then simply append it
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        Decode_String ds = new Decode_String();
        System.out.println(ds.decodeString("3[a]2[bc]"));

    }
}
