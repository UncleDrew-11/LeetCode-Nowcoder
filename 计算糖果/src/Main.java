import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String arr = sc.nextLine();
            String[] st = arr.split(" ");
            int[] arr1 = new int[st.length];
            for (int i = 0; i < st.length; i++) {
                arr1[i] = Integer.parseInt(st[i]);
            }
            int A = arr1[0];
            int B = arr1[1];
            int C = arr1[2];
            int D = arr1[3];
            int a, b, c;
            a = (A + C) / 2;
            b = (B + D) / 2;
            if (a - b == A) {
                c = D - b;
                System.out.println(a + " " + b + " "+ c);
            } else {
                System.out.println("No");
            }
        }
    }
}
