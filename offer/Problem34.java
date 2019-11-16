/**
 * 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *
 * 从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
package offer;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {
    public static void main(String[] args) {

    }


    private List<List<Integer>> lists = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();
    public List<List<Integer>> findPath(TreeNode root, int sum) {
        helper(root, sum);
        return lists;
    }

    private void helper(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum - root.val;
        list.add(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            lists.add(new ArrayList<>(list));
        }
        helper(root.left, sum);
        helper(root.right, sum);
        list.remove(list.size()-1);
    }

}
