import java.util.Scanner;

//https://www.nowcoder.com/practice/4b91205483694f449f94c179883c1fef?tpId=60&&tqId=29483&rp=1&ru=/activity/oj&qru=/ta/tsing-kaoyan/question-ranking
class Node {
    char val;
    Node left;
    Node right;
    public Node (char val) {
        this.val = val;
    }
}
public class Solution {
    static int i = 0;

    public static Node buildTree(String s) {
        //以中序遍历创建二叉树
        if (s.charAt(i) != '#') {//如果不是空
            Node root = new Node(s.charAt(i));//根是当前i的值
            i++;//i移动一位到下一位
            root.left = buildTree(s);
            i++;//再移动一位
            root.right = buildTree(s);
            return root;
        }
        return null;//如果是＃就返回空
    }

    public static void inOder(Node root) {
        if (root != null) {
            inOder(root.left);
            System.out.print(root.val + " ");
            inOder(root.right);
        }
    }

    public static void main(String[] args) {
        //获取输入
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //建立中序遍历的树
        Node root = buildTree(line);
        //中序遍历
        inOder(root);
        System.out.println();
    }
}
