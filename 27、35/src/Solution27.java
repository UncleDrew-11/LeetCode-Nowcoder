class Solution27 {
    public int removeElement(int[] nums, int val) {
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {//prev所在的位置不是val进入
                nums[prev] = nums[i];//
                prev++;
            }
        }
        return prev;
    }
}