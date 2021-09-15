/**
 * 最大子序和
 * 给定一个整数数组 nums
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素）
 * 返回其最大和
 */
package LeetCode;

public class Problem53 {
    /**
     * 动态规划
     * 线性dp问题
     * dp[n]表示nums[n]为结尾，最大和的连续子数组
     */
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for(int i = 1; i < nums.length; ++i) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
