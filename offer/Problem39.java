/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 * 假设数组非空，并且一定存在满足条件的数字。
 */
package offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem39 {
    public static void main(String[] args) {

    }

    /**
     * 遍历数组，将其放入到一个map中，
     * key值为数组的值， map值为数组出现的字数
     * 然后遍历这个map, 如果拿出来的值大于数组长度的一半
     * 则返回key值
     * @param nums
     * @return
     */
    public int moreThanHalfNum_Solution(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; ++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * 初始化两个变量
     * 一个res表示数组中某个数字，初始值为nums[0]
     * 一个count表示数字出现的字数，初始值为1
     * 从下标值为1开始遍历数组，如果等于res,则count加1
     * 不相等则减1
     * 当count 等于0的时候，则res重新赋值nums[i], count = 1
     * @param nums
     * @return
     */
    public int moreThanHalfNum_Solution1(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (res == nums[i]) {
                ++count;
            } else {
                --count;
            }
            if (count == 0) {
                res = nums[i];
                count = 1;
            }
        }
        return res;
    }
}
