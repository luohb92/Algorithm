package LeetCode;
public class Problem977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int k = nums.length -1;
        for(int i = 0, j = nums.length -1; i <= j;) {
            if(nums[i] * nums[i] > nums[j] * nums[j]) {
                res[k] = nums[i] * nums[i];
                --k;
                ++i;
            } else {
                res[k] = nums[j] * nums[j];
                --k;
                --j;
            }
        }
        return res;
    }
}
