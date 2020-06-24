import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;
        for (int n : nums) {
            if (n == prev) {
                return n;
            }
            prev = n;
        }
        return -1;
    }
}