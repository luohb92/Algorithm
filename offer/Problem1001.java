package offer;

public class Problem1001 {
    /**
     * 空间复杂度O(n)
     * 时间复杂度O(n)
     */
    public int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; ++i) {
            dp[i] = (dp[i -1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }

    /**
     * 空间复杂度O(1)
     * 时间复杂度O(n)
     */
    public int fib1(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
       int a = 0, b = 1, sum = 0;
       for(int i = 2; i <= n; ++i) {
           sum = (a + b) % 1000000007;
           a = b;
           b = sum;
       }
       return sum;
    }
}
