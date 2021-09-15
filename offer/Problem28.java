/**
 * 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 *
 * 如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
package offer;

public class Problem28 {
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        } else if(left == null && right != null) {
            return false;
        } else if(left != null && right == null) {
            return false;
        } else if(left.val != right.val) {
            return false;
        }
        return helper(left.left, right.right) && helper(left.right, right.left);
    }



}
