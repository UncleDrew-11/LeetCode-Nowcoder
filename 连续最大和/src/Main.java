//没有区分负数也在内的情况
/*
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[n];
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    stack.add(arr[i]);
                } else {
                    while (!stack.isEmpty()) {
                        result[a] += stack.pop();
                    }
                    a++;
                }
            }
            if (!stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    result[a] += stack.pop();
                }
                a++;
            }
            int max = 0;
            for (int i : result) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}
*/


