import java.util.Stack;

/**
 * 使用递归和非递归方法
 * 前序遍历，中序遍历，后序遍历二叉树
 * 牛客网地址
 * https://www.nowcoder.com/practice/566f7f9d68c24691aa5abd8abefa798c?tpId=101&tqId=33229&tPage=8&rp=8&ru=/ta/programmer-code-interview-guide&qru=/ta/programmer-code-interview-guide/question-ranking
 */
public class Problem160 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        preOrderRecure(root);
        System.out.println();
        inOrderRecure(root);
        System.out.println();
        posOrderRecure(root);
    }

    /**
     * 递归前序遍历
     * @param root
     */
    public static  void preOrderRecure(TreeNode root) {
        if(root == null) {
            return;
        }
        while(root != null) {
            System.out.print(root.val + " ");
            preOrderRecure(root.left);
            preOrderRecure(root.right);
        }
    }

    /**
     * 递归中序遍历
     * @param root
     */
    public static void inOrderRecure(TreeNode root) {
        if(root == null) {
            return;
        }
        while(root != null) {
            inOrderRecure(root.left);
            System.out.print(root.val + " ");
            inOrderRecure(root.right);
        }

    }

    /**
     * 递归后序遍历
     * @param root
     */
    public  static void posOrderRecure(TreeNode root) {
        if(root == null) {
            return;
        }
        while(root != null) {
            posOrderRecure(root.left);
            posOrderRecure(root.right);
            System.out.print(root.val + " ");
        }
    }

    /**
     * 非递归前序遍历
     * @param node
     */
    public static void preOrderNoRecure(TreeNode root) {
        TreeNode node = root;
        if(node != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(node);
            while(!stack.isEmpty()) {
                node = stack.pop();
                System.out.print(node.val + " ");
                if(node.right != null) {
                    stack.push(node.right);
                }
                if(node.left != null) {
                    stack.push(node.left);
                }
            }
        }
    }

    /**
     * 非递归中序遍历
     * @param root
     */
    public static void inOrderNoRecure(TreeNode root) {
        TreeNode node = root;
        if(node != null) {
            Stack<TreeNode> stack = new Stack<>();
            while(! stack.isEmpty() || node != null) {
                if(node  != null) {
                    stack.push(node);
                    node = node.left;
                } else {
                    node = stack.pop();
                    System.out.println(node.val + " ");
                    node = node.right;
                }
            }
        }
    }

}