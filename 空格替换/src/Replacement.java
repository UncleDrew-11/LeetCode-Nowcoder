import java.util.*;

public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for (char c : iniString.toCharArray()) {

            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String st = sc.nextLine();
            System.out.println(replaceSpace(st, st.length()));
        }
    }
}