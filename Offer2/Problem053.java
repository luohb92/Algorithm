package Offer2;

import java.util.Stack;

public class Problem053 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        boolean found = false;
        while(cur != null || !stack.isEmpty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if(found) {
                break;
            } else if(p == cur) {
                found = true;
            }
            cur = cur.right;
        }
        return cur;

    }

    public TreeNode inorderSuccessor1(TreeNode root, TreeNode p) {
        TreeNode cur = root;
        TreeNode res = null;
        while(cur != null) {
            if(cur.val > p.val) {
                res = cur;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return res;

    }
}
