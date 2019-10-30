/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * 示例 1:
 *
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 *
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem771 {
    public static void main(String[] args) {

    }

    /**
     * 使用一个Set保存J 中所有的值
     * 然后遍历S，如果值在Set包含，则加1
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); ++i) {
            set.add(J.charAt(i));
        }
        int num = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (set.contains(S.charAt(i))) {
                ++num;
            }
        }
        return num;
    }
}
