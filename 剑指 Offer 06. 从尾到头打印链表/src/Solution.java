import jsj.ListNode;

import java.util.Stack;

class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        int[] ret = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            ret[i] = stack.pop();
            i++;
        }
        return ret;
    }
}