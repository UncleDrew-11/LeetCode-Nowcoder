import java.util.Stack;

class Solution {
    public static String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();//创建一个空栈
        for (char c : S.toCharArray()) {//遍历S字符串
            if (Character.isLetter(c)) {
                letters.push(c);//如果是字母就入栈
            }
        }
        StringBuilder sb = new StringBuilder();//创建一个String
        for (char c : S.toCharArray()){//再次遍历字符串
            if (Character.isLetter(c)) {
                sb.append(letters.pop());
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        reverseOnlyLetters("Test1ng-Leet=code-Q!");
    }
}