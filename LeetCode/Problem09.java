/**
 * 判断一个整数是否是回文数。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 */
package LeetCode;

public class Problem09 {
    /**
     * 首先负数肯定不是回文数
     * 将x反转，如果反转后的值和x相等，则是回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int cur = 0;
        int n = x;
        while (n != 0) {
            cur = cur * 10 + n %10;
            n = n / 10;
        }
        return cur == x;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        String string = String.valueOf(x);
        int left = 0;
        int right = string.length()-1;
        while(left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            ++left;
            ++right;
        }
        return true;
    }
}
