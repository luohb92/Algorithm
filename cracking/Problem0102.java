package cracking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem0102 {

    public static void main(String[] args) {

    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); ++i) {
            char key = s1.charAt(i);
            if (map.containsKey(s1.charAt(i))) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for (int i = 0; i < s2.length(); ++i) {
            char key = s2.charAt(i);
            if (!map.containsKey(key)) {
                return false;
            } else if (map.get(key) != 0){
                map.put(key, map.get(key) -1);
            } else {
                return false;
            }
        }
        return true;

    }
}
