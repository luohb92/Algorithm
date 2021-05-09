package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem1189 {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); ++i) {
            char a = text.charAt(i);
            if (a == 'b' || a == 'a' || a == 'l' || a == 'o' || a == 'n') {
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
        }
        int numB = map.getOrDefault('b', 0);
        int numa = map.getOrDefault('a', 0);
        int numL = map.getOrDefault('l', 0);
        int numO = map.getOrDefault('o', 0);
        int numN = map.getOrDefault('n', 0);
        int sum = 0;
        for (int i = 0; i < numB; ++i) {
            numa = numa - 1;
            numL = numL - 2;
            numO = numO - 2;
            numN = numN -1;
            if (numa <0 || numL < 0 || numO < 0 || numN < 0) {
                return sum;
            }
            ++sum;
        }
        return sum;
    }
}
