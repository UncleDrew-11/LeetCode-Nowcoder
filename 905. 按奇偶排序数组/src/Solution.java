import java.util.Stack;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        Stack<Integer> arr = new Stack<>();//创建一个空栈
        for (int c : A) {
            if (c % 2 != 0) {//奇数
                arr.push(c);//放入栈中
            }
        }
        for (int c : A) {
            if (c % 2 == 0) {//偶数
                arr.push(c);//偶数放在奇数上
            }
        }
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = arr.pop();
        }
        return B;
    }
}