package LeetCode;

import java.util.Arrays;

public class Problem279 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i * i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                if(j - i*i >=0 && dp[j - i * i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j - i * i] + 1, dp[j]);
                }
            }
        }
        return dp[n];

    }
}
