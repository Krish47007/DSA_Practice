package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Baseball_Game {

    public int calPoints(String[] operations) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String x : operations) {
            switch (x) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val2);
                    stack.push(val1);
                    stack.push(val1 + val2);
                    break;
                default:
                    stack.push(Integer.parseInt(x));
                    break;
            }
        }

        int sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();

        return sum;
    }
}
