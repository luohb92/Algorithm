package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem113 {
    public static void main(String[] args) {

    }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, root, new ArrayList<>(), sum);
        return list;
    }

    private void helper(List<List<Integer>> list, TreeNode root ,List<Integer> path, int sum) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            list.add(path);
            return;
        }
        helper(list, root.left, new ArrayList<>(path), sum - root.val);
        helper(list, root.right, new ArrayList<>(path), sum - root.val);
    }
}
