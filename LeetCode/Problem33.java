package LeetCode;

public class Problem33 {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int length = nums.length;
        int index = length -1;
        while(nums[0] > nums[index] && nums[0] > nums[index -1]) {
            --index;
        }
        int left, right;
        if(nums[0] <= target && nums[index -1] >= target) {
            left = 0;
            right = index -1;
        } else if (nums[index] <= target && nums[length -1] >= target) {
            left = index;
            right = length -1;
        } else {
            return -1;
        }

        while(left < right) {
            int mid = (left + right) >>> 1;
            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if(nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }
}
