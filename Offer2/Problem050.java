package Offer2;

import java.util.HashMap;
import java.util.Map;

public class Problem050 {
    /**
     * 一个节点的前缀和就是该节点到根之间的路径和。
     * HashMap的key是前缀和， value是该前缀和的节点数量
     */
    public int pathSum(TreeNode root, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return dfs(root, sum, map, 0);
    }

    private int dfs(TreeNode root, int sum, Map<Integer, Integer> map, int path) {
        if(root == null) {
            return 0;
        }
        path += root.val;
        int count = map.getOrDefault(path - sum, 0);
        map.put(path, map.getOrDefault(path, 0) + 1);
        count += dfs(root.left, sum, map, path);
        count += dfs(root.right, sum, map, path);
        map.put(path, map.get(path) -1);
        return count;
    }
}
