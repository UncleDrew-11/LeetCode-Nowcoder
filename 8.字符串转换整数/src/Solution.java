import java.util.Arrays;

class Solution {
    public static int myAtoi(String str) {
        int ret = Integer.parseInt(str);
        return ret;
    }

    public static void main(String[] args) {
        myAtoi("   -43");
    }
}