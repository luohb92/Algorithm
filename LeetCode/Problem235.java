/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先
 */
package LeetCode;

public class Problem235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return  lowestCommonAncestor(root.right,p, q);
        } else {
            return root;
        }
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        while(true) {
           if (root.val > p.val && root.val > q.val) {
               root = root.left;
           } else if (root.val < p.val && root.val < q.val) {
               root = root.right;
           } else {
               return root;
           }
        }
    }

}
