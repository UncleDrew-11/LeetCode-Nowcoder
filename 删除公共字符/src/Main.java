import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c : a.toCharArray()) {
                int count = 0;
                for (char d : b.toCharArray()) {
                    if (c != d) {
                        count++;
                    }
                }
                if (count == b.length()) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
