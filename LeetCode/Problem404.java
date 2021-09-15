/**
 * 左叶子之和
 * 计算给定二叉树的所有左叶子之和
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int mid = 0;
        if(root.left != null
                && root.left.left == null
                && root.left.right == null) {
            mid = root.left.val;
        }
        return mid + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
