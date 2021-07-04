/**
 * 给定一个二叉树，返回它的中序 遍历。
 */
package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class Problem94 {
    /**
     * 递归写法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            helper(result, root);
        }
        return result;

    }
    
    public void helper(List<Integer> result, TreeNode root) {
        if(root == null) {
            return;
        }
        if(root != null) {
            helper(result, root.left);
            result.add(root.val);
            helper(result, root.right);
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