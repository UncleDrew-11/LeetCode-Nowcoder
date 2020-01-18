public class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();//清除最后一个空格
        if (s.length() == 0) {
            return 0;
        }
        String[] a = s.split(" ");
        return a[a.length].length();
    }

    public static void main(String[] args) {
        lengthOfLastWord("");
    }
}