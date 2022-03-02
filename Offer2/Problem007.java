package Offer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem007 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] > 0) {
                return res;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length -1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] > 0) {
                    --right;
                } else if(nums[i] + nums[left] + nums[right] < 0) {
                    ++left;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left < right && nums[left] == nums[left+1]) {
                        ++left;
                    }
                    while(left < right && nums[right] == nums[right -1]) {
                        --right;
                    }
                    ++left;
                    --right;
                }
            }
        }
        return res;
    }
}
