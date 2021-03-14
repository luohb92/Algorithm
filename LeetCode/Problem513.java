/**
 *给定一个二叉树，在树的最后一行找到最左边的值
 */
package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Problem513 {
    public static void main(String[] args) {

    }

    /**
     * bfs层次遍历
     * 取每一层最左边的值
     * 当遍历到最后一层则获取到的是最后一行最左边的值
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = root.val;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                TreeNode node = queue.remove();
                if(i == 0) {
                    res = node.val;
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return res;
    }
}
