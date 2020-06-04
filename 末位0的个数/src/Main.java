import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long ret = 1;
            for (int i = n; i > 0; i--) {
                ret *= i;
            }
            int count = 0;
            while (ret % 10 == 0) {
                if (ret % 10 == 0) {
                    ret = ret / 10;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
