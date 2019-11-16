/**
 * 输入一棵二叉树的根结点，求该树的深度。
 *
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
package offer;

public class Problem55 {
    public static void main(String[] args) {

    }

    /**
     * 递归思路
     * 一个树的深度等于 根节点的左子树的深度和右子树较大值加1
     * @param root
     * @return
     */
    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = treeDepth(root.left);
        int rightDepth = treeDepth(root.right);
        return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
    }
}
