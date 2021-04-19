package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem77 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        backtracking(n , k, 1);
        return res;
    }

    private static void  backtracking(int n, int k, int start){
        if(path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n; ++i) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove(path.size() -1);
        }
    }
}
