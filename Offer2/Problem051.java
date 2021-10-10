package Offer2;

public class Problem051 {
    private int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
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
