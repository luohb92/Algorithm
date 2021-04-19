package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem47 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        brackTracking(nums, used);
        return res;
    }

    private void brackTracking(int[] nums, boolean[] used) {
        if(path.size() == nums.length ){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; ++i) {
            if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false) {
                continue;
            }
            if(used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            brackTracking(nums, used);
            used[i] = false;
            path.remove(path.size() -1);
        }
    }
}
