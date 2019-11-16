/**
 * 连续子数组的最大和
 * 输入一个 非空 整型数组，数组里的数可能为正，也可能为负。
 *
 * 数组中一个或连续的多个整数组成一个子数组。
 *
 * 求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 */
package offer;

public class Problem42 {
    public static void main(String[] args) {

    }

    /**
     * max记录当前最大值
     * sum记录当前累加的数值
     *
     * 如果当前累加的数值比当前遍历的到的数小，则抛弃前面的数值，使得sum= nums[i]
     *
     * 然后判断max和累加的数值的关系，修改max
     * 最终返回max即可
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum += nums[i];
            if (sum < nums[i]) {
                sum = nums[i];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * 动态规划
     * 思路
     * 定义状态: dp[i] 为数组 [0…i]中的最大和, 一定包含dp[i]
     * 注意是连续子数组, 所以必须包含最后一个元素, 否则就断了
     *
     * 定义输出: dp[]中最大的值
     *
     * 状态转移方程: dp[i] = dp[i - 1] >= 0 ? dp[i - 1] + nums[i] : nums[i]
     *
     * 因为一定包含 nums[i], 所以如果 dp[i-1] >=0, 求最大值, 就加上
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; ++i) {
            if (dp[i -1] >=0) {
                dp[i] = dp[i-1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
