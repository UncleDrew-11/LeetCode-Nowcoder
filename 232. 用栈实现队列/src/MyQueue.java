import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class MyQueue {
    public Stack<Integer> st1;
    public Stack<Integer> st2;
    /** Initialize your data structure here. */
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        st1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (st2.isEmpty()) {
            while (st1.isEmpty() == false) {
                st2.push(st1.pop());
            }
        }
        int ret =st2.pop();
        return ret;
    }

    /** Get the front element. */
    public int peek() {
        if (st2.isEmpty()) {
            while (st1.isEmpty() == false) {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */