package cracking;

public class Problem0404 {
    /**
     * 获取左子树的高度和右子树的高度
     * 如果两个高度绝对值大于1 返回false
     * 递归判断左子树和右子树是否是平衡二叉树
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 递归获取树的高度
     * 先获取左子树的高度和右子树的高度
     * 树的高度是左子树的高度与右子树的高度最大值加1
     * @param root
     * @return
     */
    private int helper(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.max(left, right) + 1;
    }
}
