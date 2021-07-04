package LeetCode;

import java.util.Arrays;

/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 */
public class Problem106 {
    /**
     * 第一步：如果数组大小为零的话，说明是空节点了。
     *
     * 第二步：如果不为空，那么取后序数组最后一个元素作为节点元素。
     *
     * 第三步：找到后序数组最后一个元素在中序数组的位置，作为切割点
     *
     * 第四步：切割中序数组，切成中序左数组和中序右数组 （顺序别搞反了，一定是先切中序数组）
     *
     * 第五步：切割后序数组，切成后序左数组和后序右数组
     *
     * 第六步：递归处理左区间和右区间
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        return helper(inorder, postorder);
    }

    private TreeNode helper(int[] inorder, int[] postorder) {
        if(postorder.length == 0) {
            return  null;
        }
        int rootValue = postorder[postorder.length -1];
        TreeNode root = new TreeNode(rootValue);
        if (postorder.length == 1) {
            return root;
        }
        int index = 0;
        for(index = 0; index < inorder.length; ++index) {
            if(inorder[index] == rootValue) {
                break;
            }
        }
        int[] leftInOrder = Arrays.copyOfRange(inorder,0, index);
        int[] rightInOrder = Arrays.copyOfRange(inorder, index+1, inorder.length);
        int[] leftPostOrder = Arrays.copyOfRange(postorder, 0, index);
        int[] rightPostOrder = Arrays.copyOfRange(postorder, index, postorder.length -1);
        root.left = helper(leftInOrder, leftPostOrder);
        root.right = helper(rightInOrder, rightPostOrder);
        return root;
    }
}
