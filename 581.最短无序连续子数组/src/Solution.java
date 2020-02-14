import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copyNums = nums.clone();//复制一个新数组与原数组相同
        Arrays.sort(copyNums);//把数组进行排序
        int start = copyNums.length;//设定开始位置
        int end = 0;//设定结束位置
        for (int i = 0; i < copyNums.length; i++) {
            if (nums[i] != copyNums[i]) {//如果与原数组不同了，进入循环
                start = Math.min(i, start);//start是小的那个数
                end = Math.max(i, end);//end是大的那个数
            }
        }
        return (end >= start ? (end - start) + 1 : 0);
    }
}
