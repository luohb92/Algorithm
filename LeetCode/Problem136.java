package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem136 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int number = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry =iterator.next();
            if (entry.getValue() == 1) {
                number = entry.getKey();
            }
        }
        return number;
    }
}
