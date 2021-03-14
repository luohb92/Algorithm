/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 *
 * 你可以假设树和k都存在，并且1≤k≤树的总结点数。
 */
package offer;

public class Problem54 {
    private int k;
    private int res;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return res;

    }

    private void helper(TreeNode root) {
        if(root == null) {
            return;
        }
        helper(root.right);
        --k;
        if(k == 0) {
            res = root.val;
            return;
        }
        helper(root.left);
    }

}
