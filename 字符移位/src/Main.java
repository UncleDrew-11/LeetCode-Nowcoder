import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String st = sc.nextLine();
            Queue<Character> list = new LinkedList<>();
            char[] crr = st.toCharArray();
            int count = 0;
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
                    list.offer(st.charAt(i));
                    crr[i] = ' ';
                    count++;
                }
            }
            List<Character> list2 = new ArrayList<>();
            for (char c : crr) {
                if (c != ' ') {
                    list2.add(c);
                }
            }
            String[] b = new String[count];
            for (int i = 0; i < count; i++) {
                b[i] = String.valueOf(list.poll());
            }
            StringBuffer x = new StringBuffer();
            for (char s : list2) {
                x.append(s);
            }
            for (String s : b) {
                x.append(s);
            }
            System.out.println(x);
        }
    }
}
