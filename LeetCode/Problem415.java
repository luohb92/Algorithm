package LeetCode;

public class Problem415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() -1;
        int j = num2.length() -1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i) -'0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            res.append(sum % 10);
            --i;
            --j;
        }
        if(carry == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
