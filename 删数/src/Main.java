import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int k = 2;
            int input = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < input; i++) {
                list.add(i);
            }
            list.remove(2);
            while (list.size() > 1) {
                    k = (k + 2) % list.size();
                    list.remove(k);
            }
            System.out.println(list.get(0));
        }
    }
}
