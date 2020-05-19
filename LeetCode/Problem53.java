/**
 * 最大子序和
 * 给定一个整数数组 nums
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素）
 * 返回其最大和
 */
package LeetCode;

public class Problem53 {
    public static void main(String[] args) {

    }

    /**
     * 动态规划
     * 时间复杂度O(n)
     * 设 f(i)表示以第 i个数字为结尾的最大连续子序列的 和 是多少。
     * 初始化 f(0)=nums[0]
     * 转移方程 f(i)=max(f(i−1)+nums[i],nums[i])
     * 可以理解为当前有两种决策，一种是将第 i 个数字和前边的数字拼接起来；
     * 另一种是第 i个数字单独作为一个新的子序列的开始。
     * 最终答案为 ans=max(f(k)),0≤k<n
     */
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int last = 0;
        for(int i = 0; i < nums.length; ++i) {
            int count = Math.max(last, 0) + nums[i];
            res = Math.max(count, res);
            last = count;
        }
        return res;
    }

}
