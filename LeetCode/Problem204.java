/**
 * 统计所有小于非负整数 n 的质数的数量
 */
package LeetCode;

import java.util.Arrays;

public class Problem204 {
    public static void main(String[] args) {

    }
    public int countPrimes(int n) {
        int res = 0;
        for(int i = 2; i < n; ++i) {
            if(helper(i)) {
                res = res + 1;
            }
        }
        return res;
    }

    private boolean helper(int n) {
        for(int i = 2; i * i <= n; ++i) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
