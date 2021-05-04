/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 */
package LeetCode;
public class Problem69 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while(left <= right) {
            long mid = left + ((right - left) >> 1);
            long sum = mid * mid;
            if(sum > x) {
                right = mid -1;
            } else if(sum < x) {
                left = mid +1;
            } else {
                return (int)mid;
            }
        }
        return (int)right;
    }
}