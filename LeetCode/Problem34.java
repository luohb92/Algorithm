/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
package LeetCode;

public class Problem34 {
    public static void main(String[] args) {
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = helperMin(nums, target);
        res[1] = helperMax(nums, target);
        return res;
    }
    private int helperMin(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid -1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || nums[mid -1] != target) {
                    return mid;
                } else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    private int helperMax(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid -1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == nums.length -1 || nums[mid +1] != target) {
                    return mid;
                } else {
                    low = mid +1;
                }
            }
        }
        return -1;
    }
}
