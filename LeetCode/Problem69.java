/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 */
package LeetCode;
public class Problem69 {
    public static void main(String[] args) {
        
    }

    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        while (low <= high) {
            long mid = low + ((high - low) >> 2);
            if (mid * mid == x ) {
                return (int) mid;
            } else if (mid * mid < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}