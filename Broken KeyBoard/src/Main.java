import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String right = sc.nextLine();
            String wrong = sc.nextLine();
            Set<Character> wrongSet = new HashSet<>();
            for (char c : wrong.toCharArray()) {
                wrongSet.add(c);
            }
            Set<Character> printSet = new HashSet<>();
            for (char c : right.toCharArray()) {
                if (!wrongSet.contains(c)) {
                    c = Character.toUpperCase(c);
                    if (!printSet.contains(c)) {
                        printSet.add(c);
                        System.out.print(c);
                    }
                }
            }
        }
    }
}
