/**
 * 数字在排序数组中出现的次数
 * 统计一个数字在排序数组中出现的次数。
 *
 * 例如输入排序数组[1, 2, 3, 3, 3, 3, 4, 5]和数字3，由于3在这个数组中出现了4次，因此输出4。
 */
package offer;

import java.util.HashMap;
import java.util.Map;

public class Problem53 {
    public static void main(String[] args) {

    }

    /**
     * 时间复杂度O(N)
     * 遍历数组，用一个Map来存储
     * key值是数组的值
     * value为数组的值出现的次数
     * @param nums
     * @param k
     * @return
     */
    public int getNumberOfK(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],  map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        if (map.containsKey(k)) {
            return map.get(k);
        } else {
            return 0;
        }
    }

    /**
     * 0到n-1中缺失的数字
     * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0到n-1之内。
     *
     * 在范围0到n-1的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
     *
     * 样例
     * 输入：[0,1,2,4]
     *
     * 输出：3
     *
     * 思路 二分查找
     * @param nums
     * @return
     */
    public int getMissingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length -1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] != mid) {
                if (mid == 0 || nums[mid -1] == mid -1) {
                    return mid;
                }
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l == nums.length) {
            return l;
        }
        return -1;
    }


    /**
     * 数组中数值和下标相等的元素
     * 假设一个单调递增的数组里的每个元素都是整数并且是唯一的。
     *
     * 请编程实现一个函数找出数组中任意一个数值等于其下标的元素。
     *
     * 例如，在数组[-3, -1, 1, 3, 5]中，数字3和它的下标相等。
     *
     * 样例
     * 输入：[-3, -1, 1, 3, 5]
     *
     * 输出：3
     * 注意:如果不存在，则返回-1。
     * @param nums
     * @return
     */
    public int getNumberSameAsIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0, r = nums.length -1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == mid) {
                return mid;
            } else {
                if (nums[mid] > mid) {
                    r = mid -1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
