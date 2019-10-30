/**
 * 给定两个数组，编写一个函数来计算它们的交集
 */
package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class Problem349 {
    public static void main(String[] args) {

    }

    /**
     * 用一个Set来保存nums1和nums2交集
     *for循环遍历nums1和nums2
     * 如果两者相等并且Set中不包含，将值add到Set中去
     * 然后遍历Set,返回一个数组
     * 时间复杂度O(n*m)
     * 空间复杂度O(n+m)
     *
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i) {
            for (int j = 0; j < nums2.length; ++j) {
                if (nums1[i] == nums2[j] && !set.contains(nums1[i])) {
                    set.add(nums1[i]);
                }
            }
        }
        Iterator<Integer> integers = set.iterator();
        int[] res = new int[set.size()];
        int i = 0;
        while (integers.hasNext()) {
            Integer integer = integers.next();
            res[i] = integer;
            ++i;
        }
        return res;
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; ++i) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; ++i) {
            set2.add(nums2[i]);
        }
        int[] res;
        if (set1.size() < set2.size()) {
            res = helper(set1, set2);
        } else {
            res = helper(set2, set1);
        }
        return res;
    }

    public int[] helper(Set<Integer> set1, Set<Integer> set2) {
        int[] res = new int[set1.size()];
        int i = 0;
        for (Integer integer: set1) {
            if (set2.contains(integer)) {
                res[i] = integer;
                ++i;
            }
        }
        return Arrays.copyOf(res, i);
    }

}
