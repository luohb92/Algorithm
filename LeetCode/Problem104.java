package LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem104 {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            ++depth;
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                root = queue.remove();
                if(root.left != null) {
                    queue.add(root.left);
                }
                if(root.right != null) {
                    queue.add(root.right);
                }
            }
        }
        return depth;
    }
    
    /**
     * 递归
     * 自顶向下
     * 深度优先搜索(DFS)
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
}