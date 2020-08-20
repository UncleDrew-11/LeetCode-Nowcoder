import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] daikuan = new int[n];
            int[][] cos = new int[m][2];
            for (int i = 0; i < n; i++) {
                daikuan[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < 2; j++) {
                    cos[i][j] = sc.nextInt();
                }
            }
            Arrays.sort(cos, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
                }
            });
            int count = 0;
            Stack<Integer> aStack = new Stack<>();
            Arrays.sort(daikuan);
            for (int i = 0; i <daikuan.length; i++) {
                aStack.add(daikuan[i]);
            }
            for (int i = 0; i < cos.length; i++) {
                if (aStack.isEmpty()) {
                    break;
                }
                if (aStack.peek() >= cos[i][0]) {

                    count += cos[i][1];
                    aStack.pop();
                }
            }
            System.out.println(count);
        }
    }
}
