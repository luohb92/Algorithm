package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem260 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] res = new int[2];
        int i = 0;
        for (int num: set) {
            res[i] = num;
            ++i;
        }
        return res;
    }
}
