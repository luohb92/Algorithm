package LeetCode;

import java.util.Arrays;

/**
 * 贪心算法
 * 把最大的饼干分给胃口最大的孩子
 */
public class Problem455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ++i;
                ++j;
            } else {
                ++j;
            }
        }
        return i;
    }
}
