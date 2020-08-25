class Solution {
    public static int[] exchange(int[] nums) {
        int low = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 == 1) {
                change(nums, low, fast);
                low++;
            }
            fast++;
        }
        return nums;
    }

    private static void change(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
/*
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        exchange(arr);
        System.out.println(arr.toString());
    }*/
}