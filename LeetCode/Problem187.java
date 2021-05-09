package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem187 {
    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int length = s.length();
        for (int i = 0; i + 10 <= length; ++i) {
            String sub = s.substring(i, i+10);
            if (map.containsKey(sub)) {
                int value = map.get(sub) + 1;
                map.put(sub, value);
                if (value == 2) {
                    list.add(sub);
                }
            } else {
                map.put(sub, 1);
            }
        }
        return list;
    }
}
