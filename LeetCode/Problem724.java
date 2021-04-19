package LeetCode;

public class Problem724 {
    public int pivotIndex(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res += num;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; ++i) {
            if(leftSum == res - nums[i] - leftSum) {
                return i ;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
