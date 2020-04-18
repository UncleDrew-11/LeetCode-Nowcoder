import java.util.*;
public class Main {
    public static String GetSequeOddNum(int m) {
        if (m == 1) {
            return "1";
        }
        StringBuffer sb = new StringBuffer();
        int n = (m * m) - (m - 1);
        for (int i = 0; i < m; i++) {
            sb.append(n + "");
            n += 2;
            if (i + 1 != m) {
                sb.append("+");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }
}
