package LeetCode;

public class Problem1464 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        if(length == 2) {
            return (nums[0] -1 ) * (nums[1] -1);
        }
        int one = Math.max(nums[0], nums[1]);
        int two = Math.min(nums[0], nums[1]);
        for(int i = 2; i < length; ++i) {
            if(nums[i] > one) {
                two = one;
                one = nums[i];
            } else {
                if(nums[i] > two) {
                    two = nums[i];
                }
            }
        }
        return (one -1) * (two -1);
    }
}
