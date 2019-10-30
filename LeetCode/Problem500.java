/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem500 {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        findWords(words);
    }

    /**
     * 将所有的字符放在一个Map中，在同一行的值相同
     * 然后遍历数组words, 拿String中第一个char在map中
     * 的值, 然后从1位置开始遍历这个String ,如果有某个值不相等
     * 则说明这个String 不能使用同一行键盘打印出来
     * @param words
     * @return
     */
    public static String[] findWords(String[] words) {
        String str1 = "QqWwEeRrTtYyUuIiOoPp";
        String str2 = "AaSsDdFfGgHhJjKkLl";
        String str3 = "ZzXxCcVvBbNnMm";
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (char a: str1.toCharArray()) {
            map.put(a, 0);
        }
        for (char a: str2.toCharArray()) {
            map.put(a, 1);
        }
        for (char a: str3.toCharArray()) {
            map.put(a, 2);
        }
        for (int i = 0; i < words.length; ++i) {
            String str = words[i];
            int value = map.get(str.charAt(0));
            boolean tag = false;
            for (int j = 1; j < str.length(); ++j) {
                if (value != map.get(str.charAt(j))) {
                    tag = true;
                    break;
                }
            }
            if (!tag) {
                list.add(str);
            }
        }
        String[] res = list.toArray(new String[list.size()]);
        return res;
    }
}
