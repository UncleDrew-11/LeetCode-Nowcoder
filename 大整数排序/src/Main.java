import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            BigInteger[] arr = new BigInteger[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextBigInteger();
            }
            Arrays.sort(arr);
            for (BigInteger i : arr) {
                System.out.println(i);
            }
        }
    }
}
