/**
 * 无重复字符的最长子串
 *给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 */
package LeetCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class Problem03 {
    public static void main(String[] args) {
        String s = "abcabcaa";
        System.out.println(lengthOfLongestSubstring(s));
    }
    /**
     * 暴力解法
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int length = s.length();
        for(int i = 0; i < length; ++i) {
            for(int j = i + 1; j <= length; ++j) {
                if (allUnique(s, i, j)) {
                    res = Math.max(res, j-i);
                }
            }
        }
        return res;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; ++i) {
            if(set.contains(s.charAt(i))){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }

    /**
     * 滑动窗口
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        int length = s.length();
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < length; ++end) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            res = Math.max(res, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return res;
    }
    
}