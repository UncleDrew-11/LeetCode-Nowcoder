import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int credit[] = new int[num];
            int scores[] = new int[num];
            for (int i = 0; i < num; i++) {
                credit[i] = sc.nextInt();
            }
            for (int i = 0; i < num; i++) {
                scores[i] = sc.nextInt();
            }
            double point = 0;
            for (int i = 0; i < num; i++) {
                if (scores[i] >= 90 && scores[i] <= 100) {
                    point += (4.0 * credit[i]);
                }
                if (scores[i] >= 85 && scores[i] <= 89) {
                    point += (3.7 * credit[i]);
                }
                if (scores[i] >= 82 && scores[i] <= 84) {
                    point += (3.3 * credit[i]);
                }
                if (scores[i] >= 78 && scores[i] <= 81) {
                    point += (3.0 * credit[i]);
                }
                if (scores[i] >= 75 && scores[i] <= 77) {
                    point += (2.7 * credit[i]);
                }
                if (scores[i] >= 72 && scores[i] <= 74) {
                    point += (2.3 * credit[i]);
                }
                if (scores[i] >= 68 && scores[i] <= 71) {
                    point += (2.0 * credit[i]);
                }
                if (scores[i] >= 64 && scores[i] <= 67) {
                    point += (1.5 * credit[i]);
                }
                if (scores[i] >= 60 && scores[i] <= 63) {
                    point += (1.0 * credit[i]);
                }
                if (scores[i] < 60) {
                    point += 0;
                }
            }
            int sum = 0;
            for (int i = 0; i < credit.length; i++) {
                sum += credit[i];
            }
            double ret = point / sum;
            System.out.format("%.2f", ret);
        }

    }
}
