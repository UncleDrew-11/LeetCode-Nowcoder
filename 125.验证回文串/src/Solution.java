class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;//是除了字母和数字的符号就跳过
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;//是除了字母和数字的符号就跳过
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                //两个不一样
                return false;
            }
            //一样的话继续进行下一个
            i++;
            j--;
        }
        return true;//跳出循环还一样，说明i和j相等再一个位置，夹逼完成，是回文
    }
}