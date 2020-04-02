import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
            Stack<Character> st = new Stack<>();
            for (char c : A.toCharArray()) {
                if (st.isEmpty()) {
                    if (c == '(') {
                        st.add(c);
                    } else {
                        return false;
                    }
                } else {
                    if (c == '(') {
                        st.add(c);
                    } else {
                        st.pop();
                    }
                }
            }
            if (st.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }

}