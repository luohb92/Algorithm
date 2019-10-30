/**
 * 找出数组中重复的数字
 * 给定一个长度为 n 的整数数组 nums，数组中所有的数字都在 0∼n−1 的范围内。
 *
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 *
 * 请找出数组中任意一个重复的数字。
 *
 * 注意：如果某些数字不在 0∼n−1 的范围内，或数组中不包含重复数字，则返回 -1；
 * 样例
 * 给定 nums = [2, 3, 5, 4, 3, 2, 6, 7]。
 *
 * 返回 2 或 3。
 */
package offer;

public class Problem03 {
    public static void main(String[] args) {
        int[] nums = {3, 1, -10, 1, 1, 4, 3, 10, 1, 1};
        duplicateInArray(nums);
    }

    /**
     * 首先先遍历nums数组，如果数组中某个值不在0~n-1范围之内则返回-1
     * 这样就保证了nums数组中所有的数据都在0~n-1范围之内
     * 然后再次遍历nums数组
     * 当nums[i] 不等于i的时候，将i位置上的值和nums[i]位置上比较
     * 如果相等则找到了一个重复值，如果不相等，交换i和nums[i]位置的值
     * 知道nums[i] == i
     * @param nums
     * @return
     */
    public static int duplicateInArray(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; ++i) {
            if (nums[i] < 0 || nums[i] >= length) {
                return -1;
            }
        }
        for (int i = 0; i < length; ++i) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return -1;
    }
}