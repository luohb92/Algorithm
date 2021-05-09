/**
 * 编写一个函数，输入是一个无符号整数，
 * 返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）
 */
package LeetCode;

public class Problem191 {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public int hammingWeight1(int n) {
        int res = 0;
        while(n != 0) {
            n &= (n-1);
            ++res;
        }
        return res;
    }
}
