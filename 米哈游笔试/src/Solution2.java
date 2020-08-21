import java.util.Scanner;

public class Solution2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            count = 0;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            if (exist(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean exist(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (dfs(arr, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int[][] arr, int i, int j) {
        if (i >= arr.length || i < 0 || j >= arr.length || j < 0 || count > 1) {
            return false;
        }
        if (count <= 1) {
            return true;
        }
        int tmp = arr[i][j];
        if (tmp == 1) {
            count++;
        }
        arr[i][j] = '/';
        boolean res = dfs(arr, i + 1, j) || dfs(arr, i - 1, j) ||
                dfs(arr, i, j + 1) || dfs(arr, i, j - 1);
        arr[i][j] = tmp;
        return res;
    }
}
