import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                //判断删除与栈顶相等了
                stack.pop();
                i++;//删除的位数加一
            }
        }
        return stack.isEmpty();
    }
}