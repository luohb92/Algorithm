/**
 * 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 *
 * 如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
package offer;

public class Problem28 {
    public static void main(String[] args) {

    }

    /**
     * 前序遍历根左右
     * 对称的前序遍历根右左
     * 如果两个序列相同则是对称树
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    public boolean helper(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }
        return helper(root1.left, root2.right) &&
                helper(root1.right, root2.left);
    }



}
