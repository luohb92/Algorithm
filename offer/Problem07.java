/**
 * 输入一棵二叉树前序遍历和中序遍历的结果，请重建该二叉树。
 *
 * 注意:
 *
 * 二叉树中每个节点的值都互不相同；
 * 输入的前序遍历和中序遍历一定合法；
 * 样例
 * 给定：
 * 前序遍历是：[3, 9, 20, 15, 7]
 * 中序遍历是：[9, 3, 15, 20, 7]
 *
 * 返回：[3, 9, 20, null, null, 15, 7, null, null, null, null]
 * 返回的二叉树如下所示：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
package offer;

import java.util.HashMap;
import java.util.Map;

public class Problem07 {
    int pre_idx = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < preorder.length; ++i) {
            idx_map.put(inorder[i], i);
        }
        return helper(0, inorder.length);
    }

    public TreeNode helper(int inLeft, int inRight) {
        if (inLeft == inRight) {
            return null;
        }
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);
        int index = idx_map.get(root_val);
        pre_idx++;
        root.left = helper(inLeft, index);
        root.right = helper(index + 1, inRight);
        return root;

    }



}
