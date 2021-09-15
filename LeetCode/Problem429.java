package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; ++i) {
                Node node = queue.remove();
                list.add(node.val);
                if (node.children != null) {
                    for (int j = 0; j < node.children.size(); ++j) {
                        queue.add(node.children.get(j));
                    }
                }
            }
            res.add(list);
        }
        return res;
    }

}
