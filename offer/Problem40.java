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
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for(int i = 0; i < k; ++i) {
            res[i] = arr[i];
        }
        return res;
    }
}
