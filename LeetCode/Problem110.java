/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1
 */
package LeetCode;
public class Problem110 {
    public static void main(String[] args) {
        
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftDeep = helper(root.left);
        int rightDeep = helper(root.right);
        if(Math.abs(leftDeep - rightDeep) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int  helper(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDeep = helper(root.left);
        int rightDeep = helper(root.right);
        return Math.max(leftDeep, rightDeep) + 1;
    }


}