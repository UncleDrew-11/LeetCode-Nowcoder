import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] a = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = a.length - 1; i >= 0; i--) {
                sb.append(a[i]);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}

