/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）
 */
package LeetCode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Problem102 {
    /**
     * 层次遍历，利用队列保存每层的数据
     * 队列的长度就是每层数据的个数
     * 遍历循环队列，然后for循环每层数据
     * 从队列中remove出队列的头部
     * 如果当前树的左子树不为空，加入到队列中
     * 如果当前树的右子树不为空，加入到队列中
     * 将当前树的值放在到一个list中
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                root = queue.remove();
                if(root.left != null) {
                    queue.add(root.left);
                }
                if(root.right != null) {
                    queue.add(root.right);
                }
                list.add(root.val);
            }
            res.add(list);

        }
        return res;
    }
}