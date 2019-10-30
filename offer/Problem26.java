/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 *
 * 我们规定空树不是任何树的子结构
 */
package offer;

public class Problem26 {
    public static void main(String[] args) {
        TreeNode pRoot1 = new TreeNode(8);
        pRoot1.left = new TreeNode(8);
        pRoot1.right = new TreeNode(7);
        pRoot1.left.left = new TreeNode(9);
        pRoot1.left.right = new TreeNode(2);
        pRoot1.left.right.left = new TreeNode(4);
        pRoot1.left.right.right = new TreeNode(7);
        TreeNode pRoot2 = new TreeNode(8);
        pRoot2.left = new TreeNode(9);
        pRoot2.right = new TreeNode(2);
//        System.out.print(hasSubtree(pRoot1, pRoot2));
    }

    /**
     * 递归方法
     * 代码分两个方法
     * 1 判断当前A树的当前节点和B树的根节点是否相同
     * 2 如果相同，判断其他位置是否相同
     * 第1个方法，直接遍历A树
     * 第二个方法
     * 如果B树的节点为空，证明A的节点和B的所有节点都相同
     * 如果B树节点不为空，A树节点为空，则说明不匹配
     * 如果两个节点的值不同，则不匹配
     * 如果当前位置匹配，递归AB两课树各自的左子树和右子树是否匹配
     * @param pRoot1
     * @param pRoot2
     * @return
     */
    public  boolean hasSubtree(TreeNode pRoot1, TreeNode pRoot2) {
        boolean res = false;
        if (pRoot1 != null && pRoot2 != null) {
            if (pRoot1.val == pRoot2.val) {
                res = helper(pRoot1, pRoot2);
            }
            if (!res) {
                hasSubtree(pRoot1.left, pRoot2);
            }
            if (!res) {
                hasSubtree(pRoot1.right, pRoot2);
            }
        }
        return res;
    }

    public  boolean helper(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot2 == null) {
            return true;
        }
        if (pRoot1 == null) {
            return false;
        }
        if (pRoot1.val != pRoot2.val) {
            return false;
        }
        return helper(pRoot1.left, pRoot2.left) && helper(pRoot1.right, pRoot2.right);
    }

}
