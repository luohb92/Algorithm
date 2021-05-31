package LeetCode;

public class Problem45 {
    public int jump(int[] nums) {
        int end = 0;
        int res = 0;
        int max = 0;
        for(int i = 0; i < nums.length -1; ++i) {
            max = Math.max(max, nums[i] + i);
            if(i == end) {
                end = max;
                ++res;
            }
        }
        return res;
    }
}
