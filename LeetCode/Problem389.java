package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem389 {
    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char a = s.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < t.length(); ++i) {
            char a = t.charAt(i);
            if (map.containsKey(a)) {
                map.put(a , map.get(a) -1);
            } else {
                map.put(a, 1);
            }
        }
        char result =' ';
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer>   entry = iterator.next();
            if (entry.getValue() == 1 || entry.getValue() < 0) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
