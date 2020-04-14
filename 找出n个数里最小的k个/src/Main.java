import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] st = string.split(" ");
            int k = Integer.valueOf(st[st.length - 1]);
            int[] arr = new int[st.length - 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
