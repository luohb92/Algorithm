/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀
 * 如果不存在公共前缀，返回空字符串 ""
 */
package LeetCode;

public class Problem14 {
    public static void main(String[] args) {

    }

    /**
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res =  strs[0];
        for (int i = 1; i < strs.length; ++i) {
            int j = 0;
            for (; j< res.length() && j < strs[i].length(); ++j) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
        }
        return res;
    }
}
