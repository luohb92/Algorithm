package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem384 {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
