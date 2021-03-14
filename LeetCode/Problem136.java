package LeetCode;
public class Problem136 {

    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
