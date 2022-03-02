package Offer2;

public class Problem008 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int subLength = 0;
        int res = Integer.MAX_VALUE;
        for(int j = 0; j < nums.length; ++j) {
            sum += nums[j];
            while(i <= j && sum >= target) {
                subLength = j - i +1;
                res = Math.min(res, subLength);
                sum -= nums[i];
                ++i;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
