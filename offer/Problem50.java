package offer;

import java.util.HashMap;

public class Problem50 {
    public static void main(String[] args) {

    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char cha : chars) {
            if (map.containsKey(cha)) {
                map.put(cha, false);
            } else {
                map.put(cha, true);
            }
        }
        for (char cha : chars) {
            if (map.get(cha)) {
                return cha;
            }
        }
        return 'a';
    }
}
