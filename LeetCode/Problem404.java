/**
 * 左叶子之和
 * 计算给定二叉树的所有左叶子之和
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem404 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        root.right = right;
    }
}
