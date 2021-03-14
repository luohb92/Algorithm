package LeetCode;

public class Problem572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return dfs(s, t);
    }

    private boolean dfs(TreeNode s, TreeNode t) {
        if(s == null) {
            return false;
        }
        return helper(s, t) || dfs(s.left ,t) || dfs(s.right, t);
    }

    private boolean helper(TreeNode s, TreeNode t) {
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(s.val != t.val) {
            return false;
        }
        return helper(s.left, t.left) && helper(s.right, t.right);
    }
}
