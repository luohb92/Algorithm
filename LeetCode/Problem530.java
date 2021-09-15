package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem530 {
    /**
     * 二查搜索树中序遍历，是递增的
     * 
     */
    TreeNode pre;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
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
