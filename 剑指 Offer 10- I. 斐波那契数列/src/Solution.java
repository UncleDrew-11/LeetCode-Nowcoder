
//答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
//
//
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}