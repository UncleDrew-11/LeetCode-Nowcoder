import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] start = new int[num];
            int[] finish = new int[num];
            int[] price = new int[num];
            boolean[] choose = new boolean[num];
            for (int i = 0; i < num; i++) {
                start[i] = sc.nextInt();
                finish[i] = sc.nextInt();
                price[i] = sc.nextInt();
            }
            int[][] arr = new int[num][3];
            for (int i = 0; i < num; i++) {
                arr[i][0] = start[i];
            }
            for (int i = 0; i < num; i++) {
                arr[i][1] = finish[i];
            }
            for (int i = 0; i < num; i++) {
                arr[i][2] = price[i];
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            for (int i = 0; i < 3; i++) {
                start[i] = arr[i][0];
            }
            for (int i = 0; i < 3; i++) {
                finish[i] = arr[i][0];
            }
            for (int i = 0; i < 3; i++) {
                price[i] = arr[i][0];
            }
            int count = 0;
            int j = 0;
            for (int i = 1; i < num; i++) {
                if (start[i] >= finish[j]) {
                    count += price[i];
                    j = i;
                }
            }
            System.out.println(count);
        }
    }
}
