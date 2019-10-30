/**
 * 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字
 * 你可以假设除了整数 0 之外，这个整数不会以零开头
 */
package LeetCode;

public class Problem66 {
    public static void main(String[] args) {
        int[] digits = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] res = plusOne(digits);
        for (int i = 0; i < res.length; ++i) {
            System.out.println(res[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length -1; i >= 0; --i ) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
