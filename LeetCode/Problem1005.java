package LeetCode;

import java.util.Arrays;

public class Problem1005 {
    /**
     * 两次贪心
     * 先让数组从小到大排序
     * 遍历整个数组，如果值为负数，则取反，K减一
     * 经过第一次遍历后，最小大K个负数都变成了正数
     * 经过第一次遍历后，如果K不为0，则需要把最小的数取反剩余的K次
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                --k;
            }
        }
        Arrays.sort(nums);
        while(k > 0) {
            nums[0] = -nums[0];
            --k;
        }
        int res = 0;
        for(int i = 0; i < nums.length; ++i){
            res += nums[i];
        }
        return res;
    }
}
