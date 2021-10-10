package LeetCode;

import Offer2.TreeNode;

public class Problem124 {
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(Offer2.TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int sum = root.val + Math.max(left, 0) + Math.max(right, 0);
        res = Math.max(res, sum);
        return Math.max(Math.max(left, right),0) + root.val;
    }

}
