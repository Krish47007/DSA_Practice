package advance.day_44_queue_impl.assignment;

import java.util.Stack;

class UserQueue {

    /** Initialize your data structure here. */

    private static Stack<Integer> enqueueStack;
    private static Stack<Integer> dequeueStack;

     UserQueue() {

         this.enqueueStack = new Stack<>();
         this.dequeueStack = new Stack<>();
    }


    /** Push element X to the back of queue. */
    static void push(int X) {

        enqueueStack.push(X);
    }

    /** Removes the element from in front of queue and returns that element. */
    static int pop() {

        if(!dequeueStack.isEmpty())
        {
            return dequeueStack.pop();
        }
       else
        {
            while (!enqueueStack.isEmpty())
            {
                dequeueStack.push(enqueueStack.pop());
            }
            return dequeueStack.pop();
        }
    }

    /** Get the front element of the queue. */
    static int peek() {
        if(!dequeueStack.isEmpty())
        {
            return dequeueStack.peek();
        }
        else
        {
            while (!enqueueStack.isEmpty())
            {
                dequeueStack.push(enqueueStack.pop());
            }
            return dequeueStack.peek();
        }
    }

    /** Returns whether the queue is empty. */
    static boolean empty() {

        return enqueueStack.isEmpty() && dequeueStack.empty();
    }
}
