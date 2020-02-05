import java.util.Arrays;

class Solution { // [3, 2, 1]  [1, 2, 3]
    public int thirdMax(int[] nums) {
        int[] newNums = nums;
        int flag = 1;
        Arrays.sort(newNums);
        if (newNums.length == 1) {
            return newNums[0];
        }
        if (newNums.length == 2) {
            return newNums[1];
        }
        if (newNums.length >= 3) {
            for (int i = newNums.length - 2; i >= 0; i--) {
                if (newNums[i] != newNums[i + 1]) {
                    flag += 1;
                }
                if (flag == 3) {
                    return newNums[i];
                }
            }
            return newNums[newNums.length - 1];
        }
    }
}