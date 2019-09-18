import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。
 * 每一层输出一行
 */
public class Problem60 {
    public static void main(String[] args) {
        
    }

    /**
     * 按层次遍历二叉树
     * 
     */
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        if(pRoot == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> nodeList = new ArrayList<>();
        int start = 0;
        int end = 1;
        while(! queue.isEmpty()) {
            TreeNode current = queue.remove();
            nodeList.add(current.val);
            ++start;
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
            if(start == end) {
                start = 0;
                end = queue.size();
                result.add(nodeList);
                nodeList = new ArrayList<>();

            }
        }
        return result;
    }

}