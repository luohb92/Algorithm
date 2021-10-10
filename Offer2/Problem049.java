package Offer2;

public class Problem049 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);

    }

    private int dfs(TreeNode root, int res) {
        if(root == null) {
            return 0;
        }
        res = res * 10 + root.val;
        if(root.left == null && root.right == null) {
            return res;
        }
        return dfs(root.left , res) + dfs(root.right, res);
    }
}
