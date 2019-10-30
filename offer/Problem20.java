package offer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Problem20 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(6);
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        LinkedList<TreeNode> temp = new LinkedList<>();
        temp.add(root);
        while(!temp.isEmpty()) {
            TreeNode node = temp.remove();
            result.add(node.val);
            if(node.left != null) {
                temp.add(node.left);
            }
            if(node.right != null) {
                temp.add(node.right);
            }
        }
        return result;
    }
}