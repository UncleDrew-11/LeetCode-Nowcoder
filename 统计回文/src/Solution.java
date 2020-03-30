import java.util.*;

class Solution {
    public static boolean isSymmetry(String st) {
        StringBuilder sb = new StringBuilder();
        sb.append(st);
        return st.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int count = 0;
        while (sn.hasNextLine()) {
            String a = sn.nextLine();
            String b = sn.nextLine();
                for (int i = 0; i <= a.length(); i++) {
                    StringBuilder sb = new StringBuilder(a);
                    sb.insert(i, b);//在i的位置插入b
                    if (isSymmetry(sb.toString())) {
                        count++;
                    }
                }
                System.out.println(count);

        }
    }
}