package Offer2;

import java.util.Stack;

public class Problem052 {
        public TreeNode increasingBST(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            TreeNode pre = null;
            TreeNode res = null;
            while(cur != null || !stack.isEmpty()) {
                while(cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                if(pre == null) {
                    res = cur;
                } else {
                    pre.right = cur;
                }
                cur.left = null;
                pre = cur;
                cur = cur.right;
            }
            return res;
        }
}
