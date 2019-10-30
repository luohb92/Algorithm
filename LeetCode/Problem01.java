/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem01 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        twoSum2(nums, 6);
    }

    /**
     * 暴力解法
     * 两次遍历，如果两个数相加等于target就返回
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] res = new int[2];
        for(int i = 0; i < length; ++i) {
            for(int j = i + 1; j < length; ++j) {
                if(target == nums[i] + nums[j]) {
                    res[0] = i;
                    res[1] = j; 
                }
            }
        }
        return res;
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int length = nums.length;
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            int m = target - nums[i];
            if (map.containsKey(m)) {
                res[0] = i;
                res[1] = map.get(m);
                return res;
            }
            map.put(nums[i] , i);
        }
        return res;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}