/**
 * 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。
 * 字母异位词指字母相同，但排列不同的字符串
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 *[
 *["ate","eat","tea"],
 *["nat","tan"],
 *["bat"]
 *]
 */
package LeetCode;

import java.util.*;

public class Problem49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for (String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
