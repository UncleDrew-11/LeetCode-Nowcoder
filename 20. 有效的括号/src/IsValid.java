import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        final char[][] array = {{'(', ')'},
                {'[', ']'}, {'{', '}'}};
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curCh = s.charAt(i);
            int flag = 0;
            for (int j = 0; j < array.length; j++) {
                if (curCh == array[j][0]) {//是不是左括号
                    st.push(curCh);//左括号入栈
                    flag = 1;
                    break;
                }
            }
            //不是左括号
            if (flag == 0) {
                //栈内是空的，还是左括号，直接返回错误
                if (st.isEmpty()) {
                    return false;
                }
                //不是空的
                char topCh = st.pop();//获取栈顶元素并删除
                for (int k = 0; k < array.length; k++) {
                    if (topCh == array[k][0]) {//是某一个左括号
                        if (curCh == array[k][1]) {//当前的是不是和左括号对应
                            break;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
