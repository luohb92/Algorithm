package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) +1);
            } else {
                map.put(num, 1);
            }
        }
        for (int x : map.keySet()) {
            if (map.get(x) == 1) return x;
        }
        return -1;
    }
}
