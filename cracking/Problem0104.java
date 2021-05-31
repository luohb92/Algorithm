package cracking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 *  
 *
 * 示例1：
 *
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem0104 {
    /**
     * 每个字符出现的次数为偶数, 或者有且只有一个字符出现的次数为奇数时, 是回文的排列
     * @param s
     * @return
     */
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for(char a : s.toCharArray()) {
            if(set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }
        return set.size() <= 1;
    }

    public boolean canPermutePalindrome1(String s) {
        int[] map = new int[128];
        int res = 0;
        for(char a: s.toCharArray()) {
            int count = ++map[a];
            if (count % 2 == 0){
                --res;
            } else {
                ++res;
            }
        }
        return res <= 1;
    }
}
