package advance.day_42_stacks_1.assignment;

import java.util.Stack;

public class Evaluate_Expression {

    private static boolean isOperator(String ch)
    {
        switch (ch)
        {
            case "+" :
            case "-" :
            case "*" :
            case "/" : return true;
            default : return false;
        }
    }
    public static int evalRPN(String[] A) {

        Stack<Integer> stack = new Stack<>();
        for (String ch : A)
        {
            if(isOperator(ch))
            {
                int val1 = !stack.isEmpty() ? stack.pop() : 0;
                int val2 = !stack.isEmpty() ? stack.pop() : 0;
                int tempAns = 0;
                switch (ch)
                {
                    case "+" : tempAns = val1 + val2;
                                break;
                    case "-" : tempAns =  val2 - val1;
                                break;
                    case "*" : tempAns = val1 * val2;
                                break;
                    case "/" : tempAns = val2 / val1;
                                break;
                }
                stack.push(tempAns);
            }
            else
                stack.push(Integer.parseInt(ch));
        }
        return stack.peek();
    }

    public static void main(String[] args) {

        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
