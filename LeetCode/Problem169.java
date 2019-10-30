package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int num = 0;
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
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > nums.length / 2) {
                num =  entry.getKey();
            }
        }
        return num;
    }
}
