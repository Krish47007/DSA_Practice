package advance.day_42_stacks_1.assignment;

import java.util.Stack;

public class Passing_Game {

    public static int solve(int A, int B, int[] C) {

        Stack<Integer> stack = new Stack<>();
        //initially B has the ball
        int possessor = B;
        stack.push(B);
        int idx = 0;
        while (A > 0)
        {
            if(C[idx] != 0)
            {
                stack.push(C[idx]);
                possessor = stack.peek();
            }
            else
            {
                stack.pop();
                possessor = stack.peek();
            }
            idx++;
            A--;
        }
        return possessor;
    }

    public static void main(String[] args) {

        System.out.println(solve(10,23,new int[]{86, 63, 60, 0, 47, 0, 99, 9, 0, 0}));
        System.out.println(solve(1,1,new int[]{2}));
    }
}
