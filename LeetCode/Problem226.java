/**
 * 翻转一棵二叉树
 */
package LeetCode;

public class Problem226 {
    public static void main(String[] args) {

    }

    /**
     * 递归写法
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode cur = root;
        TreeNode temp = cur.left;
        cur.left = cur.right;
        cur.right = temp;
        invertTree(cur.left);
        invertTree(cur.right);
        return root;
    }
}
