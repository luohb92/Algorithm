/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
package LeetCode;
import java.util.Stack;
public class Problem101 {
    public static void main(String[] args) {
        
    }

    /**
     * 递归写法
     * 一个二叉树是镜像对称则必须满足以下三点
     * 1.两个根节点的值相等
     * 2.左边的左子树和右边的右子树对称
     * 3.左边的右子树和右边的左子树对称
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return helper(root.left, root.right);
        
    }

    public boolean helper(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && helper(p.left, q.right) && helper(p.right, q.left);
    }

    /**
     * 迭代方法
     * 对于左子树安装左根右遍历
     * 对于右子树按照右根左遍历
     * @param root
     * @return
     */
    public boolean isSymmetric1(TreeNode root) {
        if(root == null) {
            return true;
        }
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        TreeNode left = root.left;
        TreeNode right = root.right;
        while(left != null || right != null || !leftStack.isEmpty() || !rightStack.isEmpty()) {
            while(left != null || right!= null) {
                leftStack.push(left);
                if(left != null) {
                    left = left.left;
                }
                rightStack.push(right);
                if(right != null) {
                    right = right.right;
                }
            }
            if(!leftStack.isEmpty()) {
                left = leftStack.pop();
            }
            if(!rightStack.isEmpty()) {
                right = rightStack.pop();
            }
            if(left == null || right == null) {
                return false;
            }
            if(left.val != right.val) {
                return false;
            }
            left = left.right;
            right = right.left;

        }
        return true;
    }
}