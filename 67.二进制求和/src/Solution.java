class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ca = 0;//进位
        for (int i = a.length() - 1, j = b.length() - 1;
        i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            } else {
                sum += 0;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            } else {
                sum += 0;
            }
            sb.append(sum % 2);
            ca = sum / 2;
        }
        if (ca == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}