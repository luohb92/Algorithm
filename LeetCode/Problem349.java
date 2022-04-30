/**
 * 给定两个数组，编写一个函数来计算它们的交集
 */
package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class Problem349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for(int num : nums2) {
            if (set.contains(num)) {
                set2.add(num);
            }
        }

        int[] res = new int[set2.size()];
        int i = 0;
        for(int num : set) {
            res[i] = num;
            ++i;
        }
        return res;
    }

}
