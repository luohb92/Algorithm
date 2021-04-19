package LeetCode;

import java.util.Arrays;

public class Problem674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int res = 1;
        for(int i = 0; i < nums.length -1; ++i) {
            if(nums[i+1] > nums[i]) {
                dp[i+1] = 1 + dp[i];
                res = Math.max(res, dp[i+1]);
            }
        }
        return res;
    }
}
