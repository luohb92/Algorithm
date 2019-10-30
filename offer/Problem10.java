/**
 * 斐波那契数列
 * 输入一个整数 n ，求斐波那契数列的第 n 项。
 *
 * 假定从0开始，第0项为0。(n<=39)
 * 样例
 * 输入整数 n=5
 *
 * 返回 5
 */
package offer;

public class Problem10 {
    public static void main(String[] args) {

    }

    /**
     * 递归解法
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /**
     * 从下往上计算
     * @param n
     * @return
     */
    public int Fibonacci1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int one = 0;
        int two = 1;
        int res = 0;
        for (int i = 2; i <= n; ++i) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }
}
