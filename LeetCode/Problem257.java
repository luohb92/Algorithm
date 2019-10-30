/**
 * 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem257 {
    public static void main(String[] args) {

    }

    /**
     * 递归写法
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        help(root, "", paths);
        return paths;
    }

    public void help(TreeNode root , String path, List<String> paths) {
        if (root != null) {
            path = path + Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path = path + "->";
                help(root.left, path, paths);
                help(root.right, path, paths);
            }
        }
    }
}
