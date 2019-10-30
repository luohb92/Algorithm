/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1
 */
package LeetCode;

public class Problem509 {
    public static void main(String[] args) {

    }

    /**
     * 递归解法
     */
    public int fib(int N) {
        if(N == 0) {
            return 0;
        }
        if(N == 1) {
            return 1;
        }
        return fib(N-1) + fib(N-2);
    }

    /**
     * 从下往上计算
     * @param N
     * @return
     */
    public int fib1(int N) {
        if (N <= 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int one = 0;
        int two = 1;
        int res = 0;
        for (int i = 2; i <= N; ++i) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
}
