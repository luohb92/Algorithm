package LeetCode;

public class Problem572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
//        if(root == null) {
//            return false;
//        }
//        return helper(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        return false;
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
