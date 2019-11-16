/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 *
 * 你可以假设树和k都存在，并且1≤k≤树的总结点数。
 */
package offer;

public class Problem54 {
    public static void main(String[] args) {

    }

    public TreeNode res;
    public int a;
    public TreeNode kthNode(TreeNode root, int k) {
        a = k;
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (--a == 0) {
            res = root;
        }
        helper(root.right);
    }

}
