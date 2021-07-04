package LeetCode;

import java.util.Arrays;

public class Problem561 {
    /**
     * 先将数组排序
     * 最大在总和其实就是 偶数下标的值
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < nums.length; i = i +2) {
            res += nums[i];
        }
        return res;
    }
}
