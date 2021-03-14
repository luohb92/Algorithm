/**
 * 给定两个数组，编写一个函数来计算它们的交集
 */
package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class Problem349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; ++i) {
            set.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; ++i) {
            if(set.contains(nums2[i])&& !set2.contains(nums2[i])) {
                set2.add(nums2[i]);
                list.add(nums2[i]);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); ++i) {
            res[i] = list.get(i);
        }
        return res;
    }

}
