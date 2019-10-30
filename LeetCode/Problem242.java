/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 */
package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
           char c = s.charAt(i);
           if (map.containsKey(c)) {
               map.put(c, map.get(c) + 1);
           } else {
               map.put(c , 1);
           }
        }
        for (int i = 0; i < t.length(); ++i) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c , map.get(c) -1);
            } else {
                map.put(c, 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
