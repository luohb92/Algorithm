/**
 * 不分行从上往下打印二叉树
 * 从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印
 */
package offer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Problem32 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> lists = printFromTopToBottom1(root);
        for (int i = 0; i < lists.size(); ++i) {
            List<Integer> list = lists.get(i);
//            System.out.println(list.size());
            for (int j = 0; j < list.size(); ++j) {
                System.out.print(list.get(j));
            }
        }
        System.out.println();
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

    /**
     * 变形题
     * 分行从上往下打印二叉树
     * 从上到下按层打印二叉树，同一层的结点按从左到右的顺序打印，每一层打印到一行
     * @param root
     * @return
     */

    public static List<List<Integer>> printFromTopToBottom1(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int currentSize = 1;
        int nextSize = 0;
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
                ++nextSize;
            }
            if (node.right != null) {
                queue.add(node.right);
                ++nextSize;
            }
            list.add(node.val);
            --currentSize;
            if (currentSize == 0) {
                currentSize = nextSize;
                nextSize = 0;
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }


}
