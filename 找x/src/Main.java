import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == x) {
                    System.out.println(i);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(-1);
            }
        }
    }
}
