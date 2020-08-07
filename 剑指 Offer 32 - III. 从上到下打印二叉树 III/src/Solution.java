import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
      TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null) {
            queue.add(root);
        }
        List<List<Integer>> ret = new LinkedList<>();
        while (!queue.isEmpty()) {
            LinkedList<Integer> son = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (ret.size() % 2 == 0) {
                    son.addLast(node.val);
                } else {
                    son.addFirst(node.val);
                }
                if (ret.size() % 2 == 0) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            ret.add(son);
        }
        return ret;
    }
}