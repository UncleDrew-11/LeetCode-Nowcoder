import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-" :
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*" :
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/" :
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first / second);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;

            }
        }
        return stack.pop();
    }
}
