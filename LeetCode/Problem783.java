/**
 * 二叉搜索树结点最小距离
 * 给定一个二叉搜索树的根结点 root, 返回树中任意两节点的差的最小值
 */
package LeetCode;

public class Problem783 {
    TreeNode pre;
    int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return res;
    }

    public void helper(TreeNode root) {
        if(root == null) {
            return;
        }
        helper(root.left);
        if(pre != null) {
            res = Math.min(res, root.val - pre.val);
        }
        pre = root;
        helper(root.right);

    }
}
