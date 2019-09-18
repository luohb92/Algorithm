/**
 * 题目描述
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）
 * 中，按结点数值大小顺序第三小结点的值为4
 */
import java.util.ArrayList;
import java.util.Stack;

public class Problem62 {
    public static void main(String[] args) {
        
    }

    /**
     * 中序遍历二叉搜索树后排序是从小到大的排序
     * 倒数第k个节点的值就是排序后的第k-1个节点的值
     * 
     */
    public static TreeNode KthNode(TreeNode pRoot, int k){
        ArrayList<TreeNode> reslut = new ArrayList<>();
        Stack<TreeNode> statck = new Stack<>();
        TreeNode node = pRoot;
        while(node != null || !statck.isEmpty()) {
            while(node != null) {
                statck.push(node);
                node = node.left;
            }
            if(!statck.isEmpty()) {
                node = statck.pop();
                reslut.add(node);
                node = node.right;
            }
        }
        if(reslut.size() <= 0 || k > reslut.size()) {
            return null;
        }
        if( k > 0) {
            return reslut.get(k-1);
        } else {
            return null;
        }
    }
}