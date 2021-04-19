package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem216 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, k , 1);
        return res;
    }

    private void backtracking(int n , int k, int start) {
        if(path.size() == k) {
            if(sum(path) == n) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i = start; i <= 9; ++i) {
            path.add(i);
            backtracking(n, k, i+1);
            path.remove(path.size() -1);
        }
    }

    private int sum(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }
        return sum;
    }
}
