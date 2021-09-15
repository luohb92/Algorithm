package Offer2;

public class Problem003 {
    /**
     * 用 i & (i-1)
     * 不断遍历
     * 时间复杂度O(nk)
     */
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i <= n; ++i) {
            int j = i;
            while(j != 0) {
                ++res[i];
                j = j & (j-1);
            }
        }
        return res;
    }

    /**
     * i比 i&(i-1)中的1 多一个
     * 时间复杂度O(nk)
     */
    public int[] countBits1(int n) {
        int[] res = new int[n+1];
        for(int i = 1; i <= n; ++i) {
            res[i] = res[i & (i -1)] + 1;
        }
        return res;
    }
}
