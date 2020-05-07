import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int students = sc.nextInt();
            int num = sc.nextInt();
            int scores[] = new int[students];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = sc.nextInt();
            }
            for (int i = 0; i < num; i++) {
                String order = sc.next();
                if (order.equals("Q")) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    if (left > right) {
                        int tmp = left;
                        left = right;
                        right = tmp;
                    }
                    int max = left - 1;
                    for (int j = left - 1; j <= right - 1; j++) {
                        if (scores[j] > scores[max]) {
                            max = j;
                        }
                    }
                    System.out.println(scores[max]);
                } else {
                    int source = sc.nextInt();
                    int target = sc.nextInt();
                    scores[source - 1] = target;
                }
            }
        }
    }
}
