/**
 * 不分行从上往下打印二叉树
 * 从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印
 */
package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem32 {
    public static void main(String[] args) {

    }

    /**
     * 层次遍历
     * 将每一层的节点放到一个队列中
     * 如果某个节点的left不为null, 将left加入到队列中
     * 如果某个节点的right不为null,将right加入到队列中
     * @param root
     * @return
     */
    public List<Integer> printFromTopToBottom(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            list.add(node.val);
        }
        return list;
    }


}
