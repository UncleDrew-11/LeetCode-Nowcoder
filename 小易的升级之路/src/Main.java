import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int power = sc.nextInt();
            int[] monsters = new int[n];
            for (int i = 0; i < n; i++) {
                monsters[i] = sc.nextInt();
            }
            int nowPower = power;
            for (int i = 0; i < monsters.length; i++) {
                if (monsters[i] <= nowPower) {
                    nowPower += monsters[i];
                } else {
                    nowPower += gcd(monsters[i], nowPower);
                }
            }
            System.out.println(nowPower);
        }
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
