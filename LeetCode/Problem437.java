package LeetCode;

public class Problem437 {
    private int res;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return 0;
        }
        dfs(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return res;
    }

    private void dfs(TreeNode root, int sum) {
        if(root == null) {
            return;
        }
        sum -= root.val;
        if(sum == 0) {
            ++res;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
}
