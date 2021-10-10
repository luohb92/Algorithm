package Offer2;

import java.util.Stack;

public class Problem055 {
    class BSTIterator {
        TreeNode cur;
        Stack<TreeNode> stack;

        public BSTIterator(TreeNode root) {
            cur = root;
            stack = new Stack<>();
        }

        public int next() {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            int val = cur.val;
            cur = cur.right;
            return val;
        }

        public boolean hasNext() {
            return cur != null || !stack.isEmpty();
        }
    }
}
