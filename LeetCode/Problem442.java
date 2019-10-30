package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem442 {
    public static void main(String[] args) {

    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}
