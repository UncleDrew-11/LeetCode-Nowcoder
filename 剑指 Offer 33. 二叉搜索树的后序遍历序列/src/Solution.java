class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]) {
        //找到左子树的范围（比根小的数），直到比根大就停止
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]) {
        //找到在右子树中比根小的
            p++;
        }
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}