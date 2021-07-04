package LeetCode;

public class Problem135 {
    /**
     * 两次贪心
     * 一次是从左到右遍历，只比较右边孩子评分比左边大的情况
     * 一次是从右到左遍历，只比较左边孩子评分比右边大的情况
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] candy = new int[length];
        for (int i = 0; i < length; ++i) {
            candy[i] = 1;
        }
        for(int i = 1; i < length; ++i) {
            if(ratings[i] > ratings[i-1]) {
                candy[i] = candy[i-1] + 1;
            }
        }
        for(int i = length - 2; i >= 0; --i) {
            if(ratings[i] > ratings[i+1]) {
                candy[i] = Math.max(candy[i], candy[i+1] + 1);
            }
        }
        int res = 0;
        for(int i = 0; i < length; ++i) {
            res += candy[i];
        }
        return res;
    }
}
