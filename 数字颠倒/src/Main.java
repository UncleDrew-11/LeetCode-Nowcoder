import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = n + "";
            s.trim();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
        }
    }
}
