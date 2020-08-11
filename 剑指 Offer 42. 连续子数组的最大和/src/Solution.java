class Solution {
    public int maxSubArray(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            ret = Math.max(ret, nums[i]);
        }
        return ret;
    }
}