/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
package LeetCode;

public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = helpMin(nums, target);
        res[1] = helpMax(nums, target);
        return res;
    }

    private int helpMin(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target) {
                right = mid -1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                if(mid == 0 || nums[mid-1] != target){
                    return mid;
                } else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }

    private int helpMax(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            if(nums[mid] > target) {
                right = mid -1;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                if(mid == nums.length -1 || nums[mid +1] != target){
                    return mid;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
