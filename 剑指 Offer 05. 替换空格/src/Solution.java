class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        String update = "%20";
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            } else {
                sb.append(update);
            }
        }
        return sb.toString();
    }
}