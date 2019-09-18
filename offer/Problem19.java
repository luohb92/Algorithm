public class Problem19 {
    public static void main(String[] args) {
        
    }

    //递归遍历树的节点，只有当前节点为null
    //或者该节点左子节点和右子节点为null才不要交互左右子节点
    //交换当前节点的左右子节点，然后递归遍历该节点的左右子节点
    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left != null) {
            Mirror(root.left);
        }

        if(root.right != null) {
            Mirror(root.right);
        }
    }
}