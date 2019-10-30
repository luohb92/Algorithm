package LeetCode;

public class Problem739 {
    public static void main(String[] args) {

    }

    /**
     * 暴力解法
     * 从左往右遍历数组
     * 有两个指针，一个快指针，一个慢指针
     * 当数组在快指针这个位置的值大于慢指针所在位置的值， 加1，跳出当前循环
     * 当数组在快指针这个位置的值小于等于慢指针所在位置的值
     * 如果快指针不等length -1 , 加1
     * 当快指针已经到达数组最后一位时，值还是小于等于慢指针所在位置的值
     * 说明没有值超过慢指针所在位置的值，这个时候设置为0
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] res = new int[length];
        for (int i = 0; i < length; ++i) {
            int num = 0;
            for (int j = i + 1; j < length; ++j) {
                if (T[j] > T[i]) {
                    ++num;
                    break;
                } else {
                    if (j != length -1) {
                        ++num;
                    } else {
                        if (T[j] <= T[i]) {
                            num = 0;
                        }
                    }
                }
            }
            res[i] = num;
        }
        return res;
    }
}
