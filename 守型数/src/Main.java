import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            long b = a * a;
            int tmpA = a;
            long tmpB = b;
            int flag = 0;
            while (tmpA != 0) {
                if (tmpA % 10 != tmpB % 10) {
                    flag = 1;
                    break;
                }
                tmpA = tmpA / 10;
                tmpB = tmpB / 10;
            }
            if (flag == 1) {
                System.out.println("No!");
            } else {
                System.out.println("Yes!");
            }
        }
    }
}
