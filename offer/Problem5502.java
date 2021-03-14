package offer;

public class Problem5502 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(helper(root.left) - helper(root.right)) > 1) {
            return  false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int helper(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.max(left, right) + 1;
    }
}
