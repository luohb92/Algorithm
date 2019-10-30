/**
 * 统计所有小于非负整数 n 的质数的数量
 */
package LeetCode;

import java.util.Arrays;

public class Problem204 {
    public static void main(String[] args) {

    }
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; ++i) {
            if (isPrime[i]) {
                for (int j = i * 2; j < n ; j = j +i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i]) {
                ++count;
            }
        }
        return count;
    }

    public boolean isPrimes(int n) {
        if (n <=3) {
            return n > 1;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
