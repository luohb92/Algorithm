/**
 * 在每个树行中找最大值
 * 您需要在二叉树的每一行中找到最大的值。
 */
package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem515 {
    public static void main(String[] args) {

    }

    /**
     * bfs层次遍历
     * 遍历每层的值，找出每一层最大的值
     * 假设每一层第一个值最大记为max，遍历每一层值的时候
     * 如果发现有值比max值大，则将max赋值为该值
     * 遍历完每一层后，将max加入到返回结果list中去
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int max = queue.peek().val;
            for(int i = 0; i < size; ++i) {
                TreeNode node = queue.remove();
                if(node.val > max) {
                    max = node.val;
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(max);
        }
        return list;
    }

}
