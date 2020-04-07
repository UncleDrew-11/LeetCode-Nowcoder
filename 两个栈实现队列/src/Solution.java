
import java.util.Stack;

public class Solution {
    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        System.out.println(pop());
        push(40);
    }
}