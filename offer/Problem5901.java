package offer;

import java.util.ArrayList;
import java.util.List;

public class Problem5901 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length <= 0) {
            return new int[0];
        }
        int left = 0;
        int right = k -1;
        List<Integer> list = new ArrayList<>();
        while(right < nums.length) {
            int max = Integer.MIN_VALUE;
            for(int i = left; i <= right; ++i) {
                max = Math.max(nums[i], max);
            }
            list.add(max);
            ++left;
            ++right;
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; ++i) {
            res[i] = list.get(i);
        }
        return res;
    }
}
