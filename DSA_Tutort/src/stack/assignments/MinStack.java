package stack.assignments;

public class MinStack {

    private int[] stack;
    private int top1;
    private int[] minStack;
    private int top2;
    private static final int MAX_SIZE = 100000;

    public MinStack() {

        this.stack = new int[MAX_SIZE];
        this.minStack = new int[MAX_SIZE];
        this.top1 = this.top2 = -1;
    }

    public void push(int val) {

        stack[++top1] = val;
        if (top2 == -1 || minStack[top2] >= val)
            minStack[++top2] = val;
    }

    public void pop() {

        int val = stack[top1--];
        if (val == minStack[top2])
            top2--;
    }

    public int top() {

        return stack[top1];
    }

    public int getMin() {

        return minStack[top2];
    }
}
