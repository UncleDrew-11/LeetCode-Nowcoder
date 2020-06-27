import java.util.HashMap;

public class Main {
    HashMap<Integer, Integer> inorderMap = new HashMap<>();
    int[] preO;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preO = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
                    //前序遍历的根， 中序遍历的第0位（左子树的根）， 右子树的最后一位
    }

    private TreeNode recur(int preRoot, int inLeft, int inRight) {
        if (inLeft > inRight) {
            //左子树的根的下标（左边界）比右子树的最后一个右子树（有边界）大的时候
            //说明中序遍历已经空，已经越过叶子结点
            //
            return null;
        }
        TreeNode root = new TreeNode(preO[preRoot]);//根是先序遍历的第一个
        int i = inorderMap.get(preO[preRoot]);//在中序遍历中找到根的位置
        root.left = recur(preRoot + 1, inLeft, i - 1);//传入根，和左子树在中序遍历中的左右边界根
        root.right = recur(i - inLeft + preRoot + 1, i + 1, inRight);//根是根节点索引 + 左子树长度 + 1
        return root;
    }
}
