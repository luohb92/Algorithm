package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problem70 {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<Integer>();

        List<TreeNode> list = new LinkedList<TreeNode>();
        List<TreeNode> temp = null;
        list.add(root);
        Iterator<TreeNode> iterator = null;
        while(!list.isEmpty()){
            iterator = list.iterator();
            temp = new LinkedList<TreeNode>();
            while (iterator.hasNext()){
                TreeNode item = iterator.next();
                if (item.left != null){
                    temp.add(item.left);
                }

                if(item.right != null){
                    temp.add(item.right);
                }

                if (!iterator.hasNext()){
                    result.add(item.val);

                    list = temp;
                }
            }
        }

        return result;
    }
}
