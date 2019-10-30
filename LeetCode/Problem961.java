/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素
 */
package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem961 {
    public static void main(String[] args) {

    }
    public int repeatedNTimes(int[] A) {
        int N = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; ++i) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator =  map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == N) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
