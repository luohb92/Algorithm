package LeetCode;

public class Problem122 {
    /**
     *贪心算法
     * 取每天收益的为正数的情况
     * 收益从第二天才有
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        for(int i = 1; i < prices.length; ++i) {
            res += Math.max(prices[i] - prices[i-1], 0);
        }
        return res;
    }
}
