/**
 * 给定一个二叉树，返回它的中序 遍历。
 */
package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem94 {
    public static void main(String[] args) {
        
    }

    /**
     * 递归写法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(result, root);
        return result;

    }
    
    public void helper(List<Integer> result, TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                helper(result, root.left);
            }
            result.add(root.val);
            if(root.right != null) {
                helper(result, root.right);
            }
        }
    }
    /**
     * 利用栈
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        while( cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
            
        }
        return result;

    }

}