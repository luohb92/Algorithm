/**
 * 翻转一棵二叉树
 */
package LeetCode;

public class Problem226 {
    /**
     * 递归写法
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
