import java.util.ArrayList;
import java.util.List;

class Solution {
    //前序
    public void preOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    //中序
    public void midOder(TreeNode root, List<Integer> list) {
        if (root != null) {
            midOder(root.left, list);
            list.add(root.val);
            midOder(root.right, list);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOder(root, list);
        return list;
    }

    //后序
    public void lastOder(TreeNode root, List<Integer> list) {
        if (root != null) {
            lastOder(root.left, list);
            lastOder(root.right, list);
            list.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        lastOder(root, list);
        return list;
    }
}