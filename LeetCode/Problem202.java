/**
 * 编写一个算法来判断一个数是不是“快乐数”
 * 一个“快乐数”定义为：对于一个正整数，
 * 每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。
 * 如果可以变为 1，那么这个数就是快乐数
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1) {
            n = helper(n);
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    private int helper(int n) {
        int sum = 0;
        int m = 0;
        while(n != 0) {
            m = n % 10;
            n /= 10;
            sum += m * m;
        }
        return sum;
    }
}
