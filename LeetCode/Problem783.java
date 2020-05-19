/**
 * 二叉搜索树结点最小距离
 * 给定一个二叉搜索树的根结点 root, 返回树中任意两节点的差的最小值
 */
package LeetCode;

public class Problem783 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(99);
        root.left = new TreeNode(84);
        root.left.left = new TreeNode(27);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(53);
    }

    Integer pre = null;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return min;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != null) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);

    }
}
