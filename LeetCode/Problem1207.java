/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false
 */
package LeetCode;

import java.util.*;

public class Problem1207 {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n:arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        Iterator<Map.Entry<Integer, Integer>> iterator =  map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (set.contains(entry.getValue())) {
                return false;
            } else {
                set.add(entry.getValue());
            }
        }
        return true;
    }
}
