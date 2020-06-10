package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            helper(result, root);
        }
        return result;
    }

    /**
     * 递归写法
     */
    public void helper(List<Integer> result, TreeNode root) {
        result.add(root.val);
        if (root.left != null) {
            helper(result, root.left);
        }
        if (root.right != null) {
            helper(result, root.right);
        }
    }
}
