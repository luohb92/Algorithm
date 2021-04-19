package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return res;
    }

    private void backTracking(int[] candidates, int target, int sum, int start) {
        if(sum > target) {
            return;
        }
        if(sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < candidates.length; ++i) {
            sum += candidates[i];
            path.add(candidates[i]);
            backTracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.remove(path.size() -1);
        }
    }
}
