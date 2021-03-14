package LeetCode;

public class Problem992 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        for (int num: nums) {
            if(num % 2 == 0) {
                res[i] = num;
                i = i + 2;
            }
        }
        i = 1;
        for(int num : nums) {
            if(num % 2 != 0) {
                res[i] = num;
                i = i + 2;
            }
        }
        return res;
    }
}
