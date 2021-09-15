package LeetCode;
public class Problem136 {

    /**
     * 位运算，0和其他数异或返回本身
     * 自身和自身异或为0
     */
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
