/**
 * 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem257 {
    /**
     * 递归写法
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(root, "", paths);
        return paths;
    }

    private void dfs(TreeNode root, String path, List<String> res){
        if(root == null) {
            return;
        }
        path += root.val;
        if(root.left == null && root.right == null) {
            res.add(path);
            return;
        }
        dfs(root.left, path + "->", res);
        dfs(root.right, path + "->", res);
    }
}
