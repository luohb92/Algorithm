package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem275 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
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
