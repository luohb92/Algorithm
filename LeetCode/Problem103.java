/**
 * 给定一个二叉树，返回其节点值的锯齿形层次遍历。（
 * 即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行
 */
package LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Problem103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int deep = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                root = queue.remove();
                if(deep % 2 == 0) {
                    list.add(root.val);
                } else {
                    list.add(0, root.val);
                }
                if(root.left != null) {
                    queue.add(root.left);
                }
                if(root.right != null) {
                    queue.add(root.right);
                }
            }
            ++deep;
            res.add(list);
        }
        return res;
    }
}