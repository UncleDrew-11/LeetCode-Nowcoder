
class Solution {
/*
    public int countDigitOne(int n) {
        int counts = 0;
        for (int i = 1; i <= n; i++) {
            counts += includeOne(i);
        }
        return counts;
    }

    public int includeOne(int n) {
        int counts = 0;
        if (n == 1) {
            return 1;
        }
        while (n != 0) {
            if (n % 10 == 1) {
                counts++;
            }
            n = n / 10;
        }
        return counts;
    }
*/
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.countDigitOne(824883294));
    }
}
