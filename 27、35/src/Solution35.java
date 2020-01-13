class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {//数值相同
                return i;
            }
            if (nums[i] > target) {//i比目标大
                return i;
            }
        }
        return nums.length;
    }
}
