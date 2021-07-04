package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Problem145 {
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

    /**
     * 迭代法
     * 用栈来实现
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(0, node.val);
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return res;
    }
}
