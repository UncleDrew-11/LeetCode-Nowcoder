 class Solution {
    public static int findIndex(int[] nums, int target, boolean left) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if (nums[mid] > target || left && (target == nums[mid])) {//left为真确定做下标，为假确定有下表、标志
                rightIndex = mid;
            } else {
                leftIndex = mid + 1;
            }
        }
        return leftIndex;
    }

    public static int[] searchRange(int[] nums, int target) {
        int retRange[] = {-1, -1};
        int left = findIndex(nums, target, true);//查询做下表
        if (left == nums.length - 1 || nums[left] != target) {//查询结束发现不是target
            return retRange;
        }
        retRange[0] = left;
        retRange[1] = findIndex(nums, target, false) - 1;
        return  retRange;
    }
}