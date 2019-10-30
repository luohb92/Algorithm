package LeetCode;

public class Problem121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                if (prices[j] > prices[i]) {
                    max = Math.max(max, prices[j]-prices[i]);
                }
            }
        }
        return max;
    }
}
