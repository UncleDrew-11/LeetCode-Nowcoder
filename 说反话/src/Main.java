import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String source = sc.nextLine();
            String[] split = source.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = split.length - 1; i >= 0; i--) {
                sb.append(split[i]);
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
