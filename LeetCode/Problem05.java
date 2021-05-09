/**
 * 最长回文字符串
 */
package LeetCode;

public class Problem05 {
    public static String longestPalindrome(String s) {
        String str="";
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i, k = i; j>=0 &&
                    k< s.length() &&
                    s.charAt(j) == s.charAt(k); --j, ++k) {
                if (str.length() < k -j +1) {
                    str= s.substring(j, k+1);
                }
            }
        }
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i, k = i+1; j>=0 &&
                    k< s.length() &&
                    s.charAt(j) == s.charAt(k); --j, ++k) {
                if (str.length() < k -j +1) {
                    str= s.substring(j, k+1);
                }
            }
        }
        return str;
    }
}
