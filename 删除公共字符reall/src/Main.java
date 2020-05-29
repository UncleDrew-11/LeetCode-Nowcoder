import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String old = sc.nextLine();
            String common = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            List<Character> commonList = new LinkedList<>();
            for (char c : common.toCharArray()) {
                commonList.add(c);
            }
            for (char c : old.toCharArray()) {
                if (!commonList.contains(c)) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
