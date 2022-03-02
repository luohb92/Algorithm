package Offer2;

public class Problem009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        long sum = 1;
        int res = 0;
        for(int right = 0; right < nums.length; ++right) {
            sum *= nums[right];
            while(left <= right && sum >= k) {
                sum /= nums[left];
                ++left;
            }
            res += right >= left ? right - left + 1 : 0;
        }
        return res;
    }
}
