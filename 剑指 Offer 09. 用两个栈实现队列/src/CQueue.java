import java.util.Stack;

class CQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        st1.push(value);//第一个栈负责尾插入队
    }

    public int deleteHead() {//第二个栈负责把第一个栈倒过来，然后删除
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (st2.isEmpty()) {
            return -1;
        }
        return st2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */