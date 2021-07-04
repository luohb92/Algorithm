package cracking;

public class Problem0412 {
    private int res;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
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
