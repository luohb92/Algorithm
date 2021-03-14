package LeetCode;

public class Problem559 {
    public static void main(String[] args) {

    }
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int length = root.children.size();
        int res = 0;
        for(int i = 0; i < length; ++i) {
            res = Math.max(res, maxDepth(root.children.get(i)));
        }
        return res + 1;
    }
}
