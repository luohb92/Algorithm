package LeetCode;

public class Problem230 {
    int res = 0;
    int k = 0;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if(root == null) {
            return;
        }
        helper(root.left);
        --k;
        if(k == 0) {
            res = root.val;
            return;
        }
        helper(root.right);
    }
}
