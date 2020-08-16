import java.util.*;


public class Solution {
    /**
     *
     * @param num_money int整型 奖金的总数,单位为元
     * @return int整型
     * 我靠，不是斐波那契递归吗？？？我晕啦
     */
    public static int CalulateMethodCount (int num_money) {
        if (num_money == 0) {
            return 0;
        }
        if (num_money == 1) {
            return 1;
        } else {
            return CalulateMethodCount(num_money - 1) * 2;
        }
    }
}