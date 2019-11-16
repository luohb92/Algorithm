/**
 * 输入n个整数，找出其中最小的k个数。
 *
 * 注意：
 *
 * 数据保证k一定小于等于输入数组的长度;
 * 输出数组内元素请按从小到大顺序排序;
 */
package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem40 {
    public static void main(String[] args) {

    }

    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            list.add(input[i]);
        }
        return list;
    }
}
