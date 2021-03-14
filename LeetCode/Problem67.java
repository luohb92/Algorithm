/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）
 * 输入为非空字符串且只包含数字 1 和 0
 */
package LeetCode;

public class Problem67 {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for(int i = a.length() -1, j = b.length() -1; i >= 0 || j >= 0; --i,--j) {
            int x = i >=0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            builder.append(sum % 2);
            carry = sum / 2;
        }
        if(carry == 1) {
            builder.append(carry);
        }
        return builder.reverse().toString();
    }
}
