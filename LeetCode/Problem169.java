package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (res == nums[i]) {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                res = nums[i];
                count = 1;
            }
        }
        return res;
    }
}
