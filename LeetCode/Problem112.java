/**
 * 给定一个二叉树和一个目标和
 * 判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和
 */
package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem112 {
    public static void main(String[] args) {
        
    }

    /**
     * 递归解法
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        sum = sum - root.val;
        if(root.left == null && root.right == null) {
            return (sum == 0);
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    /**
     * 迭代解法
     * 使用两个队列
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum1(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sumQueue = new LinkedList<>();
        queue.add(root);
        sumQueue.add(sum);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.remove();
            int curNum = sumQueue.remove();
            if(curNode.left == null && curNode.right == null && curNode.val == curNum) {
                return true;
            }
            if (curNode.left != null) {
                queue.add(curNode.left);
                sumQueue.add(curNum-curNode.val);
            }
            if (curNode.right != null) {
                queue.add(curNode.right);
                sumQueue.add(curNum-curNode.val);
            }
        }
        return false;
    }
}