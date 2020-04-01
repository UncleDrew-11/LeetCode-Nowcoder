import java.util.*;

public class Main {
    public static int count(int[] A, int n) {
        int ret = 0;
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    ret++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(count(arr, 8));
    }
}