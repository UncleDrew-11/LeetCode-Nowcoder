import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int want = sc.nextInt();
            int count = 0;
            if (want <= 6) {
                System.out.println(count += (want / 6));
            }else if (want > 6 && want < 8) {
                System.out.println(-1);
            } else {
                while (want >= 8) {
                    want -= 8;
                    count++;
                    if (want % 6 == 0) {
                        count += want / 6;
                        want = 0;
                    } else if (want < 8) {
                        System.out.println(-1);
                    }
                }
                if (want == 0) {
                    System.out.println(count);
                }
            }

        }
    }
}