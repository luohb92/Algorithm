package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem145 {
    public static void main(String[] args) {

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            helper(result, root);
        }
        return result;
    }

    /**
     * 递归实现
     * @param result
     * @param root
     */
    public void helper(List<Integer> result, TreeNode root) {
        if (root.left != null) {
            helper(result, root.left);
        }
        if (root.right != null) {
            helper(result, root.right);
        }
        result.add(root.val);
    }
}
