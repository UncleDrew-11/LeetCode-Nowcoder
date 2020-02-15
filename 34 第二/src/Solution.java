public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder();
        for (int x : nums) {
            sb.append(x);
        }
        sb.toString();
        String stringTarget = String.valueOf(target);
        left = sb.indexOf(stringTarget);
        right = sb.lastIndexOf(stringTarget);
        return new int[] {left, right};
    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0,1,2,3,3,4,5,6,6,7,8,8,8,9,9,10,10,11,11};
        searchRange(a, 0);
    }
}
