import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> delicious = new LinkedList<>();
        int n = 0;
        while (sc.hasNext()) {
            String food = sc.next();
            if (!delicious.contains(food)) {
                delicious.add(food);
                n++;
            }
        }
        System.out.println(n);
    }
}
