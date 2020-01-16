class Solution {
    public String reverse(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        String sx = x + "";
        String reverseSx = reverse(sx);
        if (sx.equals(reverseSx)) {
            return true;
        } else {
            return false;
        }
    }
}
