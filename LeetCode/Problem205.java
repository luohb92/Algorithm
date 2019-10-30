/**
 * 同构字符串
 * 给定两个字符串 s 和 t，判断它们是否是同构的
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。
 * 两个字符不能映射到同一个字符上，但字符可以映射自己本身
 */
package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem205 {
    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else {
                if (!map.containsValue(b)) {
                    map.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
