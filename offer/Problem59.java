package offer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem59 {
    public static void main(String[] args) {
        
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> resList = new ArrayList<>();
        int left = 0;
        int right = k -1;
        while(right < nums.length) {
            int max = Integer.MIN_VALUE;
            for(int i = left; i <= right; ++i) {
                max = Math.max(max, nums[i]);
            }
            resList.add(max);
            ++left;
            ++right;
        }
        int[] res = new int[resList.size()];
//        res =resList.toArray(res);
        return res;
    }
}