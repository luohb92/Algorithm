package LeetCode;
public class Problem100 {
    /**
     * 递归解法
     * 先判断p q如果都为null的时候则返回true
     * p或者q只有一个为null的时候则返回false
     * 如果p 和 q的值不相等则返回false
     * 然后递归对左子树和右子树做以上相同处理
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}