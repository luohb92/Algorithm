package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem90 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            used[i] = false;
        }
        Arrays.sort(nums);
        brackTracking(nums, 0, used);
        return res;
    }

    private void brackTracking(int[] nums, int start, boolean[] used) {
        res.add(new ArrayList<>(path));
        for(int i = start; i < nums.length; ++i) {
            if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            brackTracking(nums, i + 1, used);
            path.remove(path.size() -1);
            used[i] = false;
        }
    }
}
