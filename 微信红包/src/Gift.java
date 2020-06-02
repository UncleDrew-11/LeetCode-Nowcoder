import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        int ans = gifts[n / 2];
        int count = 0;
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == ans) {
                count++;
            }
        }
        return count > (n / 2) ? ans : 0;
    }
}
    