package LeetCode;

public class Problem91 {
    public int numDecodings(String s) {
        int length = s.length();
        int[] dp = new int[length + 1];
        dp[0] = 1;
        for (int i = 1; i < length; ++i) {
            if (s.charAt(i-1) != '0') {
                dp[i] += dp[i - 1];
            }
//            if (i >= 2) {
//                int t = (s[i - 2] - '0') * 10 + s[i - 1] - '0';
//                if (t >= 10 && t <= 26) {
//                    dp[i] += dp[i - 2];
//                }
//            }
        }
        return dp[length];
    }
}
