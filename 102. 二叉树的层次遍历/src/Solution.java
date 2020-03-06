
import java.util.*;

public class Solution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {// 循环到队列空
            int size = queue.size();
            List<Integer> rowNode = new ArrayList<>();
            while (size > 0) {
                TreeNode topNode = queue.poll();//将队头元素拿出来
                rowNode.add(topNode.val);//行中加入
                if (topNode.left != null) {// 将左右子树放入队列
                    queue.offer(topNode.left);
                }
                if (topNode.right != null) {
                    queue.offer(topNode.right);
                }
                size--;
            }
            ret.add(rowNode);//添加这一列
        }
        return ret;
    }
}