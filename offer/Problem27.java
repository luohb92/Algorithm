/**
 * 二叉树的镜像
 * 输入一个二叉树，将它变换为它的镜像。
 */
package offer;

public class Problem27 {
    public static void main(String[] args) {

    }

    /**
     * 递归遍历原树的所有节点，将每个节点的左右儿子互换即可
     * @param root
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
