/**
 * 存在重复数字
 * 给定一个整数数组和一个整数 k，
 * 判断数组中是否存在两个不同的索引 i 和 j，
 * 使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem219 {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int value = map.get(num);
                if (i - value <= k) {
                    return true;
                }
            }
            map.put(num, i);
        }
        return false;
    }
}
