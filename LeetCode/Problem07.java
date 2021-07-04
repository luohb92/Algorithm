/**
 *整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 */
package LeetCode;

public class Problem07 {
    public  static int reverse(int x) {
        int res = 0;
        while( x != 0) {
            int y = x % 10;
            System.out.println(y);
            x = x / 10;
            if(res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if(res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            res = res * 10 + y;
        }
        return res;
    }
}
