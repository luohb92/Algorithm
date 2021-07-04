package cracking;

import java.util.ArrayList;
import java.util.List;

public class Problem0406 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        for(int i = 0; i < list.size() -1; ++i) {
            if(p == list.get(i)) {
                return list.get(i+1);
            }
        }
        return null;
    }

    private void helper(TreeNode root, List<TreeNode> list){
        if(root == null) {
            return;
        }
        helper(root.left, list);
        list.add(root);
        helper(root.right, list);

    }
}
