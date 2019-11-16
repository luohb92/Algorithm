/**
 * 输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。
 *
 * 例如输入12，从1到12这些整数中包含“1”的数字有1，10，11和12，其中“1”一共出现了5次。
 *
 * 样例
 * 输入： 12
 * 输出： 5
 */
package offer;

public class Problem43 {
    public static void main(String[] args) {

    }

    /**
     * 暴力解法
     * 从 1 到 n 计算每一个数字中1的个数
     * @param n
     * @return
     */
    public int numberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for (int i = 1; i <= n; ++i) {
            res = res + helper(i);
        }
        return res;
    }

    private int helper(int n) {
        int number = 0;
        while (n !=0) {
            if (n % 10 == 1) {
                ++number;
            }
            n = n / 10;
        }
        return number;
    }

}
