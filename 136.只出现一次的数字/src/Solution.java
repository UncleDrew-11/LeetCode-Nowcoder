import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            Integer n = mp.get(num);
            if (n == null) {//如果没出现过就放value = 1
                mp.put(num, 1);
            } else {//出现过就再把value改成n
                n++;
                mp.put(num, n);
            }
        }
        //跳出循环
        for (int num : nums) {
            if (mp.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}