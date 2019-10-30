package LeetCode;

import java.util.Map;

public class Problem525 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        findMaxLength(nums);
    }

    public static int findMaxLength(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j <= nums.length; ++j) {
                int m = 0;
                int n = 0;
                for (int k = i; k < j; ++k) {
                    if (nums[k] == 0) {
                        ++m;
                    } else {
                        ++n;
                    }
                }
                if (m == n) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}
