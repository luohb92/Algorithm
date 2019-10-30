/**
 * 给定一个二叉树，找出其最小深度
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量
 * 说明: 叶子节点是指没有子节点的节点
 */
package LeetCode;
public class Problem111 {
    public static void main(String[] args) {
        
    }
    /**
     * 递归解法
     * 当root节点左右子树都为空的时候返回1
     * 当root节点左右子树有一个为空，返回不为空的孩子节点的深度
     * 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null || root.right == null) {
            return leftDepth + rightDepth + 1;
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}