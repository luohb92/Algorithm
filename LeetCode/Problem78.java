package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        brackTracking(nums, 0);
        return res;

    }

    private void brackTracking(int[] nums, int start) {
        res.add(new ArrayList<>(path));
        if(start >= nums.length) {
            return;
        }
        for(int i = start; i < nums.length; ++i) {
            path.add(nums[i]);
            brackTracking(nums, i + 1);
            path.remove(path.size() -1);
        }
    }
}
