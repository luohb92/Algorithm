package LeetCode;

import java.util.PriorityQueue;

public class Problem215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : nums) {
            queue.add(num);
            if(queue.size() > k) {
                queue.remove();
            }
        }
        return queue.peek();
    }
}
