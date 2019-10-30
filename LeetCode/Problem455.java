package LeetCode;

import java.util.Arrays;

public class Problem455 {
    public static void main(String[] args) {

    }

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
