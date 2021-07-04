package cracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem0403 {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> res = new ArrayList<>();
        if (tree == null) {
            return new ListNode[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ListNode pre = new ListNode(-1);
            ListNode current = pre;
            for(int i = 0; i < size; ++i) {
                TreeNode node = queue.remove();
                current.next = new ListNode(node.val);
                current = current.next;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(pre.next);
        }
        return res.toArray(new ListNode[0]);

    }
}
