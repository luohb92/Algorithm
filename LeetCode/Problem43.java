package LeetCode;

public class Problem43 {
    /**
     *模拟乘法的过程
     */
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] res = new int[m+n];
        for(int i = n -1; i >= 0; --i) {
            for(int j = m -1; j >= 0; --j) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int r = a * b;
                r += res[i+j+1];
                res[i+j+1] = r % 10;
                res[i+j] += r / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m+n; ++i) {
            if(sb.length() == 0 && res[i] == 0) {
                continue;
            }
            sb.append(res[i]);
        }
        if(sb.length() == 0) {
            return "0";
        } else {
            return sb.toString();
        }
    }
}
