package LeetCode;
public class Problem98 {
    public static void main(String[] args) {
        
    }

    public boolean isValidBST(TreeNode root) {
        return bst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean bst(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }

        if(root.val < min || root.val > max) {
            return false;
        }
        return bst(root.left, min, root.val) 
        && bst(root.right, root.val, max);

    }
}